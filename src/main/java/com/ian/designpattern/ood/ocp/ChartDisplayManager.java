package com.ian.designpattern.ood.ocp;

public class ChartDisplayManager {
	
	public void display(String name) {
		switch(name) {
		case "pie":
			new PieChart().display();
			break;
		case "bar":
			new BarChart().display();
			break;
		case "line":
			new LineChart().display();
			break;
		default:
			break;
		}
	}

}
