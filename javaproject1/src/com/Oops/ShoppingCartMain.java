package com.Oops;

import java.util.Scanner;

public class ShoppingCartMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ShoppingCartEn c = new ShoppingCartEn(0, 0);

		String continues = "yes";

		System.out.println("Welcome To Shopping Mart");

		do {

			System.out.println("Choose Your Requirement");
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Get Total Amount");
			System.out.println("4. Exit");

			System.out.println("Enter Your Requirement:");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				c.addItem();
				break;

			case 2:
				c.removeItem();
				break;

			case 3:
				System.out.println("Cart Items: " + c.getCartItems());
				System.out.println("Total Amount is: " + c.getTotal());
				break;

			case 4:
				continues = "no";
				System.out.println("Thank You For Shopping !! Visit Again");
				break;

			default:
				System.out.println("Invalid Choice");
			}

			if (choice != 4) {

				System.out.println("Do you want to continue? (yes/no)");

				continues = sc.next();

			}

		} while (continues.equalsIgnoreCase("yes"));

		sc.close();
	}
}