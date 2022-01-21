package com.ian.designpattern.dp.singleton;

public class SingletonHungry {
	//餓漢式 hungry
	private static SingletonHungry singleTon = new SingletonHungry();
	private SingletonHungry() {
		
	}
	
	public static SingletonHungry getInstance() {
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
