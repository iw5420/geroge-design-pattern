package com.ian.designpattern.dp.singleton;

public class SingleTonLazy {
	//懶漢式 lazy
	private static SingleTonLazy singleTon = null;
	private SingleTonLazy() {
		
	}
	
	public static SingleTonLazy getInstance() {
		System.out.println("SingleTonLazy " + "getInstance");
		if(singleTon==null) {
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			singleTon = new SingleTonLazy();
		}
		return singleTon;
	}
}
