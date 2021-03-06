package com.ajs.hibernatewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ajs.hibernatewebapp.entity.Customer;
import com.ajs.hibernatewebapp.service.CustomerService;

@Controller 
@RequestMapping("/customer")
public class CustomerController {

	@Autowired 
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model){
		
		List<Customer> customers = customerService.getCustomers();		
		model.addAttribute("customers", customers);	
		return "list-customers";
		
	}
	
}
