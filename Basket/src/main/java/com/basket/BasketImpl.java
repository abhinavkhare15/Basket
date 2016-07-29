package com.basket;

import java.util.ArrayList;

import com.basket.model.Item;

public class BasketImpl implements Basket {

	ArrayList<Item> itemList = new ArrayList<Item>();

	/**
	 * Method return the total cost of item present in basket
	 * @return double
	 */
	public double calculateBasketPrice() {
		System.out.println("size here:: " + itemList.size());
		double total = 0;
		for (Item i : itemList) {
			total = total + i.getCost();
		}
		return total;
	}

	/**
	 * Add items to the basket
	 * @return 
	 */
	public void addItemToBasket(Item item) {
		itemList.add(item);

	}

}
