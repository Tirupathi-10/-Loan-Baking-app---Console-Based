package com.Oops;

public class AccountInfo {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();

		ba.setHolderName("SirRam Teja");

		ba.setAccountNumber(12345678984828L);

		ba.deposit(2000);

		ba.withdraw(10000);

		System.out.println("Account Holder Name: " + ba.getHolderName());

		System.out.println("Account Number: " + ba.getAccountNumber());

		System.out.println("Balance: " + ba.getBalance());
	}
}

//public void addItem(int cartItem, double price) {
//	if (price > 0) {
//		totalAmount += cartItem * price;
//	} else {
//		System.out.println("Item is not valid");
//	}
//}
//
//public void removeItem(int cartItem, double price) {
//	if (cartItem > 0) {
//		cartItem -= cartItem;
//	} else {
//		System.out.println("Invalid entry");
//	}
//	totalAmount -= price;
//}
//
//public double getTotal() {
//	return totalAmount;
//}