package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.abstractFactory.Dicos;
import com.ian.designpattern.dp.abstractFactory.IChicken;
import com.ian.designpattern.dp.abstractFactory.IChips;
import com.ian.designpattern.dp.abstractFactory.IStore;
import com.ian.designpattern.dp.abstractFactory.Mcdonald;

@SpringBootTest
public class AbstractFactoryTest {
	
	@Test
	void test() {
		IStore iStore = new Dicos();
		IChicken iChicken = iStore.getChicken();
		iChicken.eat();
		
		iStore = new Mcdonald();
		IChips iChips = iStore.getChips();
		iChips.eat();
		
	}
}
