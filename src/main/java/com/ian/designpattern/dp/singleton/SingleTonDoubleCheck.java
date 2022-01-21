package com.ian.designpattern.dp.singleton;

public class SingletonDoubleCheck {
	private volatile static SingletonDoubleCheck singleTon = null;
	
	private SingletonDoubleCheck() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public static SingletonDoubleCheck getInstance() {
		System.out.println("SingleTonDoubleCheck " + "getInstance");
		if(singleTon == null) {
			synchronized(SingletonDoubleCheck.class){
				if(singleTon == null) {
					try {
						Thread.sleep(3000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					singleTon = new SingletonDoubleCheck();
				}
			}
		}
		return singleTon;
	}
}
