package com.ian.designpattern.dp.strategy;

public class TrainTravel implements Travel {

	@Override
	public void travel() {
		System.out.println("我們坐火車出去玩, 用掉500塊! ");
	}

}
