package com.ian.designpattern.ood.dip;

public class Mother {
	
//	public void read(Book book) {
//		System.out.println("Mom is reading");
//		book.getContent();
//	}
	public void read(IReader reader) {
		System.out.println("Mom is reading");
		reader.getContent();
	}
}
