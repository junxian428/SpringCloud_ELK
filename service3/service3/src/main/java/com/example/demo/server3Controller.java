package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/service3")
@Slf4j
public class server3Controller {
    @GetMapping(value="/Message")
	public String message(){
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Service 3 API is called" + localDateTime);
		return "Service 3 API is called";
		
	}
}
