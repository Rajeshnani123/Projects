package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.model.ModelService;

@RestController
@RequestMapping("/details")
public class ModelController {
	
	
	@Autowired
	ModelService service;
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Model> model()
	{
			return service.getmodel();
	}

	@RequestMapping(value="",method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void addModel(@RequestBody Model det)
	{
		service.addModel(det);
	}
	@RequestMapping(value="/{id}")
	public Model getModel(@PathVariable("id") int id)
	{
		return this.service.getModelid(id);	
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		this.service.delete(id);
	}
}
