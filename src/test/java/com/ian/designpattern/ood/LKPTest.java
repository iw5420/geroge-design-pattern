package com.ian.designpattern.ood;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.ood.lkp.Lily;
import com.ian.designpattern.ood.lkp.Lucy;

@SpringBootTest
public class LKPTest {

	@Test
	void test() {
		new Lily().eat();
		new Lucy().eat();
	}
}
