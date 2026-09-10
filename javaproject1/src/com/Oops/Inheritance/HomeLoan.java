package com.Oops.Inheritance;

public class HomeLoan extends LoanInfo {
	void getAllHomLoanDocInfo() {
		System.out.println("Home Loan Documents have been submitted successfully !!");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to ABCD Home Loan Banking ");

		HomeLoan hl = new HomeLoan();

		if (hl.isPhoneValid() && hl.isAadharValid() && hl.isPANValid()) {

			double income = hl.getCustomerSalary();
			int cibil = hl.getCibiScore();
			int age = hl.ageInfo();

			if ((age > 18 && age <= 75) && income >= 40000.00 && cibil > 300 && cibil <= 900) {
				System.out.println("Congrtuations !! You are Eligible for Home Loan ");
				hl.getAllHomLoanDocInfo();

				double roi = hl.getROI();

				if (cibil >= 300 && cibil <= 600) {
					System.out.println("Poor Score ");
					roi = roi + 1.5;
				} else if (cibil > 600 && cibil < 700) {
					System.out.println("Fair Score");
					roi = roi + 1.0;
				} else if (cibil >= 700 && cibil < 750) {
					System.out.println("Good Score");
					roi = roi + 0.5;
				} else {
					roi = roi - 2.0;
				}

				System.out.println("Your Rate of intereset is : " + roi);

				System.out.println("As you entered your address details are :\n " + hl.getAddressDetails());
			} else {
				System.out.println("Sorry !! Focus on your financial profile first.");
			}
		} else {
			System.out.println("Something Went wrong with Personal Deatils Chack and re-enter : ");
		}
	}

}
