package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;

import com.ian.designpattern.dp.classAdapter.NoteBook;
import com.ian.designpattern.dp.classAdapter.PowerAdapter;

public class ClassAdapterTest {

	@Test
	void test() {
		NoteBook noteBook = new NoteBook();
		noteBook.powerOn(new PowerAdapter());
	}
}
