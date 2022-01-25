package com.ian.designpattern.dp.dynamicProxy;

public class KFC implements IKFC {

	@Override
	public void eat() {
		System.out.println("我們在KFC吃了頓飯! ");
	}

}
