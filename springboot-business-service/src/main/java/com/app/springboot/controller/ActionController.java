package com.app.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.business.services.CustomerService;

@ComponentScan
@RestController
public class ActionController {
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/states")
	public List<States> getStates(){	
		return customerservice.getStates();
	}
}
