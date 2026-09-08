package com.Oops;

import java.util.Scanner;

public class ShoppingCartEn {

	private int cartItems;
	private double totalAmount;

	Scanner sc = new Scanner(System.in);

	public ShoppingCartEn(int cartItems, double totalAmount) {
		this.totalAmount = totalAmount;
		this.cartItems = cartItems;
	}

	public void setCartItems(int cartItems) {
		this.cartItems = cartItems;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getCartItems() {
		return cartItems;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void addItem() {

		System.out.println("Enter Amount Of The Item : ");

		double amount = sc.nextDouble();

		cartItems += 1;
		totalAmount += amount;

		System.out.println("Item Added Successfully");
	}

	public void removeItem() {

		System.out.println("Enter Amount Of The Item To Remove : ");

		double amount = sc.nextDouble();
		if (cartItems > 0 && amount <= totalAmount) {
			cartItems -= 1;
			totalAmount -= amount;
			System.out.println("Item Removed Successfully");
		} else {
			System.out.println("Invalid Amount or Cart is Empty");
		}
	}

	public double getTotal() {

		return totalAmount;
	}
}