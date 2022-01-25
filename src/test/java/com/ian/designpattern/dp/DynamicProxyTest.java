package com.ian.designpattern.dp;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.dp.dynamicProxy.IKFC;
import com.ian.designpattern.dp.dynamicProxy.ImiSeller;
import com.ian.designpattern.dp.dynamicProxy.KFC;
import com.ian.designpattern.dp.dynamicProxy.MiStore;
import com.ian.designpattern.dp.dynamicProxy.ProxyHandler;

@SpringBootTest
public class DynamicProxyTest {

	@Test
	void test() {
		IKFC kfc = (IKFC)Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), 
				new Class[] {IKFC.class}, 
				new ProxyHandler(new KFC()));
		kfc.eat();
		ImiSeller mi = (ImiSeller)Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), 
				MiStore.class.getInterfaces(), 
				new ProxyHandler(new MiStore()));
		mi.buy();
	}
	
}
