package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Modelrepo;

@Service
public class ModelService {
	
	@Autowired
	Modelrepo repo;
	
	public List<Model> getmodel()
	{
		List<Model> details=new ArrayList<Model>();
	   repo.findAll().forEach(m ->details.add(m));
	   return details;
	}
	
	public void addModel (Model det)
	{
		repo.save(det);
	}
    
	public Model getModelid(int id)
	{
		return repo.findOne(id);
	}
	public Model update(Model upd)
	{
		return repo.save(upd);
	}
	public void delete(int id)
	{
		repo.delete(id);
	}
}
