package com.ian.designpattern.dp.strategy;

public class Person {
	private Travel travel;

	public Person(Travel travel) {
		this.travel = travel;
	}
	
	public void takeHoliday() {
		System.out.println("我們去度假了! ");
		travel.travel();
	}

}
