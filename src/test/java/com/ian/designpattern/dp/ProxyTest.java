package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;

import com.ian.designpattern.dp.proxy.HongKongMacSeller;
import com.ian.designpattern.dp.proxy.IMacSeller;

public class ProxyTest {
	
	@Test
	void test() {
		IMacSeller seller = new HongKongMacSeller();
		seller.buy();
	}
}
