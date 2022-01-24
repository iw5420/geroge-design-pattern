package com.ian.designpattern.dp.factoryMethod;

public class Mcdonald implements IStore {

	@Override
	public IChips getChips() {
		System.out.println("麥當勞生產了薯條!");
		return new MCchips();
	}

}
