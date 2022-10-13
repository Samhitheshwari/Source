package com.lulu.springemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//spring boot help us to create the rest APIs with the help of controllers(class or multiple classes act as controllers) and rest API end points.

@SpringBootApplication    //This annotations is for auto configurations. This file is needed to kick start applications.
public class SpringempApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringempApplication.class, args);
	}

}
