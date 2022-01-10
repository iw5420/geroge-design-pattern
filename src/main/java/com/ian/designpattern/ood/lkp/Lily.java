package com.ian.designpattern.ood.lkp;

public class Lily {
	public void eat() {
//		Beef beef = new Beef();
//		Vegetable vegetable = new Vegetable();
//		Bread bread = new Bread();
//		Hamburger hamburger = new Hamburger(beef, vegetable, bread);
		Hamburger hamburger = new KFC().sell();
		System.out.println("Lily eat a hamburger");
	}
}
