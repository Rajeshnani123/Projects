package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*import org.springframework.web.bind.annotation.RestController;
*/
import com.example.demo.dao.EmpRepo;
import com.example.demo.model.EmpService;
import com.example.demo.model.Employee;

 //keep Controller for JSP access and RestController for API access, Library is imported alrd for restcontroller//
@RequestMapping("/")
@Controller
public class ActionController 
{
	@Autowired
	EmpRepo repo;

	@RequestMapping("/")
   public String Home()
   {
	   return "Home.jsp";
   }
    @RequestMapping("/addcourse")
    public String Register(Employee emp)
    {
    	repo.save(emp);
    	return "AddMsg.jsp";
    }
    @RequestMapping("/courses")
	@ResponseBody
	public List<Employee> getBookstore()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/course")
	@ResponseBody
	public Employee emp (@RequestParam long id)
	{
		return repo.findOne(id);
	}
	
	
	@RequestMapping("/delcourse")
	public String delBookstore(@RequestParam long id)
	{
		repo.delete(id);
		return "Deletedmsg.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "Login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "Logout.jsp";
	}

	/* From here we are having APIs Request*/
	@Autowired
	EmpService service;
	
	@RequestMapping(value="/api",method=RequestMethod.GET)
	public List<Employee> model()
	{
			return service.getemp();
	}

	@RequestMapping(value="/api",method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void addEmployee(@RequestBody Employee emp)
	{
		 service.addEmployee(emp);
	}
	@RequestMapping(value="/api/{id}")
	public Employee getEmployee(@PathVariable("id") int id)
	{
		return this.service.getEmployeeid(id);	
	}
	
	@RequestMapping(value="/api/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		this.service.delete(id);
	}
}
