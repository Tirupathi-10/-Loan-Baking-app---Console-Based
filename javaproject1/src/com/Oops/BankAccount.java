package com.Oops;

public class BankAccount {

	private long accountNumber;

	private String holderName;

	private double balance = 5000;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposit Amount: " + amount);
		}
	}

	public void withdraw(double amount) {

		if (amount > 0 && amount <= balance) {

			balance = balance - amount;

			System.out.println("Withdraw Amount: " + amount);

		} else {

			System.err.println("Insufficient Balance");
		}
	}
}