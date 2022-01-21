package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.simpleFactory.IFood;
import com.ian.designpattern.dp.simpleFactory.Mcdonlad;


@SpringBootTest
public class SimpleFactory {


	@Test
	void test() {
		Mcdonlad mcdonlad = new Mcdonlad();
		IFood food = mcdonlad.getFood("chip");		
		if(food!=null) {
			food.eat();
		}
		
		food = mcdonlad.getFood("mcChicken");		
		if(food!=null) {
			food.eat();
		}
		
		food = mcdonlad.getFood("kfcChicken");		
		if(food!=null) {
			food.eat();
		}
	}
}
