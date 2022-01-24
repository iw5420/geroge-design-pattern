package com.ian.designpattern.dp.factoryMethod;

public class Dicos implements IStore {

	@Override
	public IChips getChips() {
		System.out.println("德克士生產了薯條!");
		return new DicosChips();
	}

}
