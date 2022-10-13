package com.lulu.springemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.springemp.entity.Helpdesk;

import com.lulu.springemp.repo.HelpDeskRepo;

@CrossOrigin
@RestController
public class ControllerHelp {
    
	@Autowired
	HelpDeskRepo helpdeskRepo;
	
  

    @PostMapping("/add_helpdesk")
    public Helpdesk createorder(@RequestBody Helpdesk helpdesk) {
        return helpdeskRepo.save(helpdesk);
    }
    @GetMapping("/get_helpdesk")
    public List<Helpdesk> getAllHelpDesk(){
    
        return helpdeskRepo.findAll();     //select * from order;
    }    
}
