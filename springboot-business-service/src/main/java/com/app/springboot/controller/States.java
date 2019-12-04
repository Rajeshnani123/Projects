package com.app.springboot.controller;

public class States {
   private String state;
   private String Statedisc;
   private String Id;
   
   public States()
   {
	   
   }
   
public States(String state, String statedisc, String id) {
	super();
	this.state = state;
	Statedisc = statedisc;
	Id = id;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getStatedisc() {
	return Statedisc;
}
public void setStatedisc(String statedisc) {
	Statedisc = statedisc;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
}
