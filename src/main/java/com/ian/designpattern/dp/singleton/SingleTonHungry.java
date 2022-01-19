package com.ian.designpattern.dp.singleton;

public class SingleTonHungry {
	//餓漢式 hungry
	private static SingleTonHungry singleTon = new SingleTonHungry();
	private SingleTonHungry() {
		
	}
	
	public static SingleTonHungry getInstance() {
		System.out.println("SingleTonHungry " + "getInstance");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return singleTon;
	}
}
