package com.ian.designpattern.dp.abstractFactory;

public class Mcdonald implements IStore {

	@Override
	public IChips getChips() {
		System.out.println("麥當勞生產了薯條!");
		return new MCchips();
	}

	@Override
	public IChicken getChicken() {
		System.out.println("麥當勞生產了麥樂雞!");
		return new McChicken();
	}

}
