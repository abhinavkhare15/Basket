package com.basket;

import com.basket.model.Item;

public interface Basket {

	double calculateBasketPrice();
	
	void addItemToBasket(Item i);

}
