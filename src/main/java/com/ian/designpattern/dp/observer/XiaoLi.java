package com.ian.designpattern.dp.observer;

public class XiaoLi implements Observer {
	
	WeatherStation weatherStation;

	public XiaoLi(WeatherStation weatherStation) {
		this.weatherStation =  weatherStation;
	}
	
	@Override
	public void update() {
		if(weatherStation.getDampness() > 50) {
			System.out.println("小李打開空調, 開始除濕! ");
		}
	}

}
