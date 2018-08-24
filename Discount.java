package com.day2;

public class Discount {
	public static double findDiscount(double itemValue) {
		double discount = (double) (itemValue * 0.35);
		double newPrice = itemValue - discount;
		return newPrice;
	}

}
