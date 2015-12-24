package com.digitek.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitek.model.Customer;

@RestController
public class MyRestController {
	
	@RequestMapping("/")
	public String showDefaultMessage() {
		return "My Spring Rest Service";
	}

	@RequestMapping("/message")
	public String showMessage(@RequestParam(value="name", required=false) String name) {
		System.out.println("message:" + name);
		return "This message is from " + name;
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST) 
	public Customer saveInformation(@RequestBody Customer customer) {
		
		System.out.println("Saving Info of "+ customer.getName());
		customer.setName("CUST");
		customer.setNo(100);
		return customer;
	}
	
	@RequestMapping(value="/fetch/{id}", method=RequestMethod.GET) 
	public Customer fetchInformation(@PathVariable(value="id") int id) {
		
		System.out.println("Got id "+ id);
		Customer customer = new Customer();
		customer.setName("CUST");
		customer.setNo(id);
		return customer;
	}	
	
	
}
