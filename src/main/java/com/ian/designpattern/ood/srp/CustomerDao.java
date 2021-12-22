package com.ian.designpattern.ood.srp;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

	protected List<Customer>findCustomers(){
		//查找數據庫
		List<Customer> ret = new ArrayList<Customer>();
		ret.add(new Customer("張三", 30));
		ret.add(new Customer("李四", 20));
		return ret;
	}
	
}
