package com.ian.designpattern.dp.abstractFactory;

public class Dicos implements IStore {

	@Override
	public IChips getChips() {
		System.out.println("德克士生產了薯條!");
		return new DicosChips();
	}

	@Override
	public IChicken getChicken() {
		System.out.println("德克士生產了手槍雞!");
		return new HandGunChicken();
	}

}
