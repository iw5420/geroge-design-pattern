package com.ian.designpattern.dp.factoryMethod;

public class KFC implements IStore {

	@Override
	public IChips getChips() {
		System.out.println("肯德基生產了薯條!");
		return new KFCChips();
	}

}
