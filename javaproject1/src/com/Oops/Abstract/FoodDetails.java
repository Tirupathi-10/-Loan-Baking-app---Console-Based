package com.Oops.Abstract;

class OrderDetails {
	int orderId;
	String customerName;
	double price;

	public OrderDetails(int orderId, String customerName, double price) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Order Id: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Price: " + price);
		System.out.println();
	}
}

class PizzaOrder extends OrderDetails {

	public PizzaOrder(int orderId, String customerName, double price) {
		super(orderId, customerName, price);
		System.out.println("Pizza Order.............");
	}

}

class BurgerOrder extends OrderDetails {

	public BurgerOrder(int orderId, String customerName, double price) {
		super(orderId, customerName, price);
		System.out.println("Burger Order.........");
	}

}

public class FoodDetails {

	public static void main(String[] args) {
		PizzaOrder po = new PizzaOrder(1, "Tiru", 299.0);
		po.displayDetails();
		BurgerOrder bo = new BurgerOrder(2, "Ravi", 599);
		bo.displayDetails();
	}

}
