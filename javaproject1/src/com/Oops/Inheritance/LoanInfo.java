package com.Oops.Inheritance;

import java.util.Scanner;

public class LoanInfo implements Loan {
	static Scanner sc = new Scanner(System.in);

	public String getAddressDetails() {

		String address = "";

		System.out.println("Enter Your Address ");
		System.out.println("Enter flat number: ");
		String flat = sc.next();

		System.out.println("Plat details : ");
		sc.nextLine();
		String plot = sc.nextLine();

		System.out.println("Enter Street : ");
		String street = sc.nextLine();

		System.out.println("Enter City : ");
		String city = sc.next();

		System.out.println("Enter State & Country ");
		String state = sc.next();
		String country = sc.next();

		address = "Flat Number    : " + flat + "\n" + "Plot Details    : " + plot + "\n" + "Street          : " + street
				+ "\n" + "City            : " + city + "\n" + "State & Country : " + state + "," + country;

		return address;
	}

	public boolean isPhoneValid() {
		System.out.println("Enter your phone number : ");
		String phone = sc.next();
		boolean isPhoneValid = phone.matches("[6-9][0-9]{9}");
		return isPhoneValid;
	}

	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar number : ");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("[0-9]{12}");
		return isAadharValid;

	}

	public boolean isPANValid() {
		System.out.println("Enter your PAN number : ");
		String pan = sc.next();
		boolean isPanValid = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
		return isPanValid;

	}

	public double getCustomerSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	public int getCibiScore() {
		System.out.println("Enter your Cibil Score : ");
		int cibil = sc.nextInt();
		return cibil;

	}

	public int ageInfo() {
		System.out.println("Enter your age  : ");
		int age = sc.nextInt();
		return age;
	}

	public double getROI() {
		return 8.5;
	}

}
