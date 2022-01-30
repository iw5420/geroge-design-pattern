package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;

import com.ian.designpattern.dp.strategy.AirplanTravel;
import com.ian.designpattern.dp.strategy.BikeTravel;
import com.ian.designpattern.dp.strategy.Person;
import com.ian.designpattern.dp.strategy.TrainTravel;
import com.ian.designpattern.dp.strategy.Travel;

public class StrategyTest {
	
	@Test
	void test() {
		//Travel travel = new BikeTravel();
		//Travel travel = new AirplanTravel();
		Travel travel = new TrainTravel();
		Person laozhang = new Person(travel);
		laozhang.takeHoliday();
	}

}
