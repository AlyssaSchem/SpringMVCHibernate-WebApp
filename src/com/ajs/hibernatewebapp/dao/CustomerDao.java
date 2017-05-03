package com.ajs.hibernatewebapp.dao;

import java.util.List;

import com.ajs.hibernatewebapp.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

}
