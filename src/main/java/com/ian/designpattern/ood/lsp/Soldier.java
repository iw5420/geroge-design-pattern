package com.ian.designpattern.ood.lsp;

public class Soldier {

	public void killEnemy(WeaponGun gun) {
		gun.shoot();
		System.out.println("soldier kill enemy");
	}
}
