package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;

import com.ian.designpattern.dp.observer.LaoWang;
import com.ian.designpattern.dp.observer.WeatherStation;
import com.ian.designpattern.dp.observer.XiaoLi;

public class ObserverTest {
	
	@Test
	void test() { 
		WeatherStation weatherStation = new WeatherStation();
		LaoWang laoWang = new LaoWang();
		XiaoLi xiaoLi = new XiaoLi();
		weatherStation.registerObserver(laoWang);
		weatherStation.registerObserver(xiaoLi);
		weatherStation.setTemperature(20);
		weatherStation.setTemperature(-10);
		weatherStation.setDampness(60);
	}

}
