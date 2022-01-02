package com.ian.designpattern.ood;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.ood.isp.AngelaBaby;
import com.ian.designpattern.ood.isp.Searcher;
import com.ian.designpattern.ood.isp.SearcherB;

@SpringBootTest
public class ISPTest {
	
	@Test
	void test() {
//		Searcher searcher = new Searcher();
//		searcher.searchActress(new AngelaBaby());
		SearcherB searcher = new SearcherB();
		searcher.searchSuperModel(new AngelaBaby());
	}
}
