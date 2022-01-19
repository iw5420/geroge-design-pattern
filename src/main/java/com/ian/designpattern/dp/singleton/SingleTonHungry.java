package com.ian.designpattern.dp.singleton;

public class SingleTonHungry {
	//餓漢式 hungry
	private static SingleTonHungry SingleTonHungry = new SingleTonHungry();
	private SingleTonHungry() {
		
	}
	
	public static SingleTonHungry getInstance() {
		return SingleTonHungry;
	}
}
