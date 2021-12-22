package com.ian.designpattern.ood;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.ood.srp.CustomerChart;
import com.ian.designpattern.ood.srp.CustomerDao;

@SpringBootTest
class SRPTest {

	@Test
	void test() {
		System.out.println("hello");
		//new CustomerChart().displayChart();
		CustomerChart customerChart = new CustomerChart();
		customerChart.setCustomerDao(new CustomerDao());
		customerChart.displayChart();
	}

}
