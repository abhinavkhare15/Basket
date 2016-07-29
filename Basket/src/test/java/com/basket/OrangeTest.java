package com.basket;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.basket.model.Orange;

public class OrangeTest {
	Orange orange;

	@Before
	public void beforeRun() {

		orange = new Orange();

	}

	@Test
	public void testOrange() {
		orange.setPricePerKg(50);
		orange.setQuantity(1);
		orange.toString();
		assertEquals("Value  ", 50, orange.getCost(), 10);

	}

	@Test
	public void testOrangeDescribe() {

		assertEquals("This is Orange", "This is Orange", orange.describe());

	}

	@After
	public void afterRun() {
		orange = null;

	}

}
