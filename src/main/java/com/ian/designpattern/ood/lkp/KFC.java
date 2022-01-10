package com.ian.designpattern.ood.lkp;

public class KFC {
	public Hamburger sell() {
		Beef beef = new Beef();
		Vegetable vegetable = new Vegetable();
		Bread bread = new Bread();
		return new Hamburger(beef, vegetable, bread);
	}
}
