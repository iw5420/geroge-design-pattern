package com.ian.designpattern.dp.observer;

public class LaoWang implements Observer {
	
	WeatherStation weatherStation;
	
	public LaoWang(WeatherStation weatherStation) {
		this.weatherStation =  weatherStation;
	}

	@Override
	public void update() {
		if(weatherStation.getTemperature() < 0) {
			System.out.println("老王穿上了羽絨服! ");
		}

	}

}
