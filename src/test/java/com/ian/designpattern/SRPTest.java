package com.ian.designpattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.srp.CustomerChart;
import com.ian.designpattern.srp.CustomerDao;

@SpringBootTest
class SRPTest {

	@Test
	void contextLoads() {
		System.out.println("hello");
		//new CustomerChart().displayChart();
		CustomerChart customerChart = new CustomerChart();
		customerChart.setCustomerDao(new CustomerDao());
		customerChart.displayChart();
	}

}
