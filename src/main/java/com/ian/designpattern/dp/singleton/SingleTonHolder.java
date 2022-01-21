package com.ian.designpattern.dp.singleton;

public class SingletonHolder {
	
	private static class SingleTonInnerHolder{
		private static SingletonHolder instance = new SingletonHolder();
	}
	
	private SingletonHolder() {
		System.out.println("SingleTonHolder " + "create");
	}

	public static SingletonHolder getInstance() {
		System.out.println("SingleTonHolder " + "getInstance");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SingleTonInnerHolder.instance;
	}
}
