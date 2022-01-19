package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.singleton.SingleTonDoubleCheck;
import com.ian.designpattern.dp.singleton.SingleTonHungry;
import com.ian.designpattern.dp.singleton.SingleTonLazy;

@SpringBootTest
public class SingleTonTest {

	//@Test
	void test() {
		System.out.println("this is A: " + SingleTonHungry.getInstance());
		System.out.println("this is B: " + SingleTonLazy.getInstance());
		System.out.println("this is A: " + SingleTonHungry.getInstance());
		System.out.println("this is B: " + SingleTonLazy.getInstance());
	}
	
	@Test
	void threadTest() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("this is SingleTon Object: " + SingleTonDoubleCheck.getInstance());
				
			}
			
		}).start();
		
		System.out.println("this is SingleTon Object: " + SingleTonDoubleCheck.getInstance());
	}
}
