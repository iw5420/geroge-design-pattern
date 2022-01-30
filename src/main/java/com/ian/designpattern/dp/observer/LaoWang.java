package com.ian.designpattern.dp.observer;

public class LaoWang implements Observer {

	@Override
	public void update(Weather weather) {
		if(weather.getTemperature() < 0) {
			System.out.println("老王穿上了羽絨服! ");
		}

	}

}
