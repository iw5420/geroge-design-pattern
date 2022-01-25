package com.ian.designpattern.dp.abstractFactory;

public class HandGunChicken implements IChicken {

	@Override
	public void eat() {
		System.out.println("我們吃到了手槍雞! ");
	}

}
