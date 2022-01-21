package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.singleton.SingletonDoubleCheck;
import com.ian.designpattern.dp.singleton.SingletonHolder;
import com.ian.designpattern.dp.singleton.SingletonHungry;
import com.ian.designpattern.dp.singleton.SingletonLazy;

@SpringBootTest
public class SingletonTest {

	//@Test
	void test() {
		System.out.println("this is A: " + SingletonHungry.getInstance());
		System.out.println("this is B: " + SingletonLazy.getInstance());
		System.out.println("this is A: " + SingletonHungry.getInstance());
		System.out.println("this is B: " + SingletonLazy.getInstance());
	}
	
	@Test
	void threadTest() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("this is SingleTon Object: " + SingletonHolder.getInstance());
				
			}
			
		}).start();
		
		System.out.println("this is SingleTon Object: " + SingletonHolder.getInstance());
	}
}
