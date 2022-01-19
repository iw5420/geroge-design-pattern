package com.ian.designpattern.dp.singleton;

public class SingleTonHolder {
	
	private static class SingleTonInnerHolder{
		private static SingleTonHolder instance = new SingleTonHolder();
	}
	
	private SingleTonHolder() {
		System.out.println("SingleTonHolder " + "create");
	}

	public static SingleTonHolder getInstance() {
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
