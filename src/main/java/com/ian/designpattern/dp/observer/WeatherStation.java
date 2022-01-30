package com.ian.designpattern.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject{
	List<Observer>observers = new ArrayList<Observer>();
	private int temperature = 0;
	private int dampness = 0;
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObserver(Weather weather) {
		for(Observer o : observers) {
			o.update(weather);
		}
		
	}

	public int getTemperature() {
		return temperature;
	}
	
	public int getDampness() {
		return dampness;
	}
	
	public void setDampness(int dampness) {
		this.dampness = dampness;
		notifyWeather(dampness);
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyWeather(dampness);
	}

	private void notifyWeather(int dampness) {
		Weather weather = new Weather();
		weather.setDampness(dampness);
		weather.setTemperature(temperature);
		notifyObserver(weather);
	}
	
		
}
