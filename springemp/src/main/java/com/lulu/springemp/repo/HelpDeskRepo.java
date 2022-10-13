package com.lulu.springemp.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lulu.springemp.entity.Helpdesk;



public interface HelpDeskRepo extends JpaRepository<Helpdesk, Integer>{

}
