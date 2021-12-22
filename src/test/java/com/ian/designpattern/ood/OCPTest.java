package com.ian.designpattern.ood;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.ian.designpattern.ood.ocp.BarChart;
import com.ian.designpattern.ood.ocp.ChartDisplayManager;
import com.ian.designpattern.ood.ocp.LineChart;
import com.ian.designpattern.ood.ocp.PieChart;

@SpringBootTest
public class OCPTest {
	
	@Test
	void test() {
		ChartDisplayManager manager = new ChartDisplayManager();
//		manager.display("bar");
//		manager.display("pie");
//		manager.display("line");
		manager.display(new LineChart());
		manager.display(new PieChart());
		manager.display(new BarChart());
	}

}
