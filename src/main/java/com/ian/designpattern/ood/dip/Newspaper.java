package com.ian.designpattern.ood.dip;

public class Newspaper implements IReader{

	@Override
	public void getContent() {
		System.out.println("鄧肯退役了");
	}
}
