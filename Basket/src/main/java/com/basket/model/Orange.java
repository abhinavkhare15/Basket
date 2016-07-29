package com.basket.model;

public class Orange extends Item {

	private double pricePerKg;
	private double quantity;

	public Orange() {
		// TODO Auto-generated constructor stub
	}

	public Orange(double pricePerKg, double quantity) {
		super();
		this.pricePerKg = pricePerKg;
		this.quantity = quantity;
	}

	/**
	 * Cost of Orange price * quantity
	 * 
	 * @return double
	 */
	@Override
	public double getCost() {

		return getPricePerKg() * getQuantity();
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String toString() {

		StringBuffer nw = new StringBuffer();
		nw.append(" pricePerKg: ").append(pricePerKg).append(" quantity: ").append(quantity);
		return nw.toString();

	}

	@Override
	public String describe() {

		return "This is Orange";
	}

}
