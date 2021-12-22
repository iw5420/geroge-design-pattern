package com.ian.designpattern.ood;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.ood.ocp.ChartDisplayManager;

@SpringBootTest
public class OCPTest {
	
	@Test
	void test() {
		ChartDisplayManager manager = new ChartDisplayManager();
		manager.display("bar");
		manager.display("pie");
		manager.display("line");
	}

}
