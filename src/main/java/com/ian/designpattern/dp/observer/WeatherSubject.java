package com.ian.designpattern.dp.observer;

public interface WeatherSubject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver(Weather weather);
}
