package com.ian.designpattern.dp.observer;

public class LaoWang implements Observer {

	@Override
	public void update(WeatherStation weatherStation) {
		if(weatherStation.getTemperature() < 0) {
			System.out.println("老王穿上了羽絨服! ");
		}

	}

}
