package com.ian.designpattern.dp.strategy;

public class AirplanTravel implements Travel {

	@Override
	public void travel() {
		System.out.println("我們坐飛機出去玩, 花掉1000塊! ");
	}

}
