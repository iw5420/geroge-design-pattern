package com.ian.designpattern.dp.abstractFactory;

public class KFC implements IStore {

	@Override
	public IChips getChips() {
		System.out.println("肯德基生產了薯條!");
		return new KFCChips();
	}

	@Override
	public IChicken getChicken() {
		System.out.println("肯德基生產了奧爾良烤翅!");
		return new OrleanChicken();
	}

}
