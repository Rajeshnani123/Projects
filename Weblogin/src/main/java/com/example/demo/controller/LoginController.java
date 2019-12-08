package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*import org.springframework.web.bind.annotation.ResponseBody;*/
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.Loginrepo;
import com.example.demo.model.Employee;

@Controller
public class LoginController {
	
	@Autowired
	Loginrepo repo;
	
	@RequestMapping("/")
	public String Home()
	{
		return "Home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee)
	{
		
	   repo.save(employee);	
	   return "Registermsg.jsp";
	   
	}
	
	/*@RequestMapping("/login")
	public String Login(@PathVariable int id)
	{
		repo.getOne(id);
		return "Loginmsg.jsp";
	}*/
	
	@RequestMapping("/login")
    public ModelAndView getEmployee(@RequestParam int id)
    {
		ModelAndView mv=new ModelAndView("Loginmsg.jsp");
		Employee employee=repo.findOne(id);
		mv.addObject(employee);
		return mv;
    }
}
