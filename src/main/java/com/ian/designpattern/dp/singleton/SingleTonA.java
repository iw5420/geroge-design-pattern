package com.ian.designpattern.dp.singleton;

public class SingleTonA {
	//餓漢式 hungry
	private static SingleTonA singleTonA = new SingleTonA();
	private SingleTonA() {
		
	}
	
	public static SingleTonA getInstance() {
		return singleTonA;
	}
}
