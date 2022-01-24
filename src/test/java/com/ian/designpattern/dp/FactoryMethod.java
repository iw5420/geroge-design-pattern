package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.factoryMethod.Dicos;
import com.ian.designpattern.dp.factoryMethod.IStore;
import com.ian.designpattern.dp.factoryMethod.KFC;

@SpringBootTest
public class FactoryMethod {

	@Test
	void test() {
		//IStore store =new Dicos();
		IStore store =new KFC();
		store.getChips().eat();
	}
}
