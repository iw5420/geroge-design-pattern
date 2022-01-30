package com.ian.designpattern.dp.observer;

public class XiaoLi implements Observer {
	
	@Override
	public void update(WeatherStation weatherStation) {
		if(weatherStation.getDampness() > 50) {
			System.out.println("小李打開空調, 開始除濕! ");
		}
	}

}
