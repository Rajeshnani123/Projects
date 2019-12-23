package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Details")

public class Employee 
{
	@Id   
	@GeneratedValue
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String coursename;
	@Column(name="status")
	private String status;

	public long getid() {
		return id;
	}
	public void setAid(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
	
	
	

