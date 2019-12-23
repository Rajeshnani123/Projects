package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpRepo;

@Service
public class EmpService {

	@Autowired
	EmpRepo repo;

	public List<Employee> getemp() {
		List<Employee> details = new ArrayList<Employee>();
		repo.findAll().forEach(m -> details.add(m));
		return details;
	}

	
	public Employee getEmployeeid(long id) {
		return repo.findOne(id);
	}

	public Employee update(Employee upd) {
		return repo.save(upd);
	}

	public void delete(long id) {
		repo.delete(id);
	}

	public void addEmployee(Employee emp) {
		repo.save(emp);
		
	}
}
