package com.ian.designpattern.dp.singleton;

public class SingleTonLazy {
	//懶漢式 lazy
	private static SingleTonLazy SingleTonLazy = null;
	private SingleTonLazy() {
		
	}
	
	public static SingleTonLazy getInstance() {
		if(SingleTonLazy==null) {
			SingleTonLazy = new SingleTonLazy();
		}
		return SingleTonLazy;
	}
}
