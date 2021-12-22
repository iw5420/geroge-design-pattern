package com.ian.designpattern.ood;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.ood.lsp.HandGun;
import com.ian.designpattern.ood.lsp.Rifle;
import com.ian.designpattern.ood.lsp.Soldier;
import com.ian.designpattern.ood.lsp.ToyGun;


@SpringBootTest
public class LSP {
	
	@Test
	void test() {
		Soldier soldier = new Soldier();
		soldier.killEnemy(new Rifle());
		soldier.killEnemy(new ToyGun());
	}
}
