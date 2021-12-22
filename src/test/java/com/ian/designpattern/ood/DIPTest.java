package com.ian.designpattern.ood;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ian.designpattern.ood.dip.Book;
import com.ian.designpattern.ood.dip.Mother;
import com.ian.designpattern.ood.dip.Newspaper;


@SpringBootTest
public class DIPTest {

	
	@Test
	void test() {
		new Mother().read(new Book());
		//new Mother().read(new Newspaper());
		//上面這行發生問題, 結果Mother只能read book 不能read newspaper
		//如果mom只能讀book相當於, mother依賴於實現(book)而不是抽象
		new Mother().read(new Newspaper());
	}
}
