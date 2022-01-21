package com.ian.designpattern.dp.singleton;

public class SingletonLazy {
	//懶漢式 lazy
	private static SingletonLazy singleTon = null;
	private SingletonLazy() {
		
	}
	
	public synchronized static SingletonLazy getInstance() {
		System.out.println("SingleTonLazy " + "getInstance");
		if(singleTon==null) {
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			singleTon = new SingletonLazy();
		}
		return singleTon;
	}
}
