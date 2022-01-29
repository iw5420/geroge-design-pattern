package com.ian.designpattern.dp;

import org.junit.jupiter.api.Test;

import com.ian.designpattern.dp.objectAdapter.NoteBook;
import com.ian.designpattern.dp.objectAdapter.Power220V;
import com.ian.designpattern.dp.objectAdapter.PowerAdapter;

public class ObjectAdapterTest {

	@Test
	void test() {
		NoteBook notebook = new NoteBook();
		PowerAdapter powerAdapter = new PowerAdapter(new Power220V());
		notebook.turnOn(powerAdapter);
	}
}
