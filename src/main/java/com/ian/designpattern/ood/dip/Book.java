package com.ian.designpattern.ood.dip;

public class Book implements IReader{

	@Override
	public void getContent() {
		System.out.println("阿里巴巴與四十大盜");
		
	}
}
