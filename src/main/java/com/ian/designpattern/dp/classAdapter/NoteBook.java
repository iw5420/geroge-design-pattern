package com.ian.designpattern.dp.classAdapter;

public class NoteBook {
	public void powerOn(Power5V power5v) {
		power5v.getPower5V();
		System.out.println("筆記本獲取了5V電壓, 開始工作");
	}
}
