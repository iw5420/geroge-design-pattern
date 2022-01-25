package com.ian.designpattern.dp.dynamicProxy;

public class MiStore implements ImiSeller {

	@Override
	public void buy() {
		System.out.println("我們買了一部小米手機");
	}

}
