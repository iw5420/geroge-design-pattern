package com.ian.designpattern.dp.simpleFactory;

public class Mcdonlad {

	public IFood getFood(String name) {
		switch(name) {
		case "chip":
			return new Chips();
		case "mcChicken":
			return new McChicken();
		default:
			System.out.println("我們不能生產這個食品");
			return null;
		}
	}
}
