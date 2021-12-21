package com.ian.designpattern.srp;

public class CustomerChart {
	
	CustomerDao dao;
	
	public void setCustomerDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	public void displayChart() {
		for(Customer customer : dao.findCustomers()) {
			System.out.println("cusomter: " + customer.name);
		}
	}
}
