package com.ian.designpattern.srp;

import java.util.ArrayList;
import java.util.List;

public class CustomerChart {
	
	protected List<Customer>findCustomers(){
		//查找數據庫
		List<Customer> ret = new ArrayList<Customer>();
		ret.add(new Customer("張三", 30));
		ret.add(new Customer("李四", 20));
		return ret;
	}
	
	public void displayChart() {
		for(Customer customer : findCustomers()) {
			System.out.println("cusomter: " + customer.name);
		}
	}
}
