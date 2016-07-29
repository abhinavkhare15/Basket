package com.basket;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.basket.model.Apple;

public class AppleTest {
	Apple apple;

	@Before
	public void beforeRun() {

		apple = new Apple();

	}

	@Test
	public void testApple() {
		apple.setPricePerKg(100);
		apple.setQuantity(10);
		apple.toString();

		assertEquals("Value after ", 1000, apple.getCost(), 10);

	}

	@Test
	public void testAppleDescribe() {

		assertEquals("This is Apple", "This is Apple", apple.describe());

	}

	@After
	public void afterRun() {
		apple = null;

	}

}
