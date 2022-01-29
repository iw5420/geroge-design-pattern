package com.ian.designpattern.dp.objectAdapter;

public class NoteBook {

	public void turnOn(Power12V power12v) {
		power12v.getPower12V();
		System.out.println("獲得到12V電, 開機! ");
	}
}
