package com.ian.designpattern.dp.singleton;

public class SingleTonDoubleCheck {
	private volatile static SingleTonDoubleCheck singleTon = null;
	
	private SingleTonDoubleCheck() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	public static SingleTonDoubleCheck getInstance() {
		System.out.println("SingleTonDoubleCheck " + "getInstance");
		if(singleTon == null) {
			synchronized(SingleTonDoubleCheck.class){
				if(singleTon == null) {
					try {
						Thread.sleep(3000L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					singleTon = new SingleTonDoubleCheck();
				}
			}
		}
		return singleTon;
	}
}
