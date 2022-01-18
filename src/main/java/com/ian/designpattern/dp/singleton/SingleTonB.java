package com.ian.designpattern.dp.singleton;

public class SingleTonB {
	//懶漢式 lazy
	private static SingleTonB singleTonB = null;
	private SingleTonB() {
		
	}
	
	public static SingleTonB getInstance() {
		if(singleTonB==null) {
			singleTonB = new SingleTonB();
		}
		return singleTonB;
	}
}
