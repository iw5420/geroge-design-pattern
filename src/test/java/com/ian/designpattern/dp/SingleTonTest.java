package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.singleton.SingleTonA;
import com.ian.designpattern.dp.singleton.SingleTonB;

@SpringBootTest
public class SingleTonTest {

	@Test
	void test() {
		System.out.println("this is A: " + SingleTonA.getInstance());
		System.out.println("this is B: " + SingleTonB.getInstance());
		System.out.println("this is A: " + SingleTonA.getInstance());
		System.out.println("this is B: " + SingleTonB.getInstance());
	}
}
