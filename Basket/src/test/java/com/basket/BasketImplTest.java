package com.basket;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.basket.model.Apple;
import com.basket.model.Item;
import com.basket.model.Orange;

public class BasketImplTest {

	Item apple, orange;
	BasketImpl basketImpl;

	@Before
	public void beforeRun() {
		basketImpl = new BasketImpl();
		apple = new Apple(140, 2);
		orange = new Orange(180, 2);

	}

	@Test
	public void testBasket() {
		basketImpl.addItemToBasket(apple);
		basketImpl.addItemToBasket(orange);
		assertEquals(640, basketImpl.calculateBasketPrice(), 10);
	}

	@After
	public void afterRun() {
		apple = null;
		orange = null;
		basketImpl = null;

	}

}
