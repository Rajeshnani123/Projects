package com.app.springboot.business.services;


import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.app.springboot.controller.States;


@Service
public class CustomerService {

	
	List<States> listate =Arrays.asList( 
			              new States("NY","NEW YORK","10"),
			              new States("CN","CANADA","20"),
			              new States("GA","GOA","30"));
			
	public List<States> getStates()
	{
		return listate;
	}
}
