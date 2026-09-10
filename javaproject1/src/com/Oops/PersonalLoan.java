package com.Oops;

public class PersonalLoan extends LoanInfo {
	void getPersonalLoanDocInfo() {
		System.out.println("All Personal Loan documents submitted successfully !!");
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to ABCD Personal Loan Banking ");

		PersonalLoan pl = new PersonalLoan();

		if (pl.isPhoneValid() && pl.isAadharValid() && pl.isPANValid()) {

			double income = pl.getCustomerSalary();
			int cibil = pl.getCibiScore();
			int age = pl.ageInfo();

			if ((age > 22 && age <= 60) && income >= 50000.00 && cibil > 300 && cibil <= 900) {
				System.out.println("Congrtuations !! You are Eligible for Personal Loan ");
				pl.getPersonalLoanDocInfo();

				double roi = pl.getROI();

				if (cibil >= 300 && cibil <= 600) {
					System.out.println("Poor Score ");
					roi = roi + 3.5;
				} else if (cibil > 600 && cibil < 700) {
					System.out.println("Fair Score");
					roi = roi + 2.5;
				} else if (cibil >= 700 && cibil < 750) {
					System.out.println("Good Score");
					roi = roi + 1.5;
				} else {
					roi = roi - 1.0;
				}

				System.out.println("Your Rate of intereset is : " + roi);

				System.out.println("As you entered your address details are :\n " + pl.getAddressDetails());
			} else {
				System.out.println("Sorry !! Focus on your financial profile first.");
			}
		} else {
			System.out.println("Something Went wrong with Personal Deatils Chack and re-enter : ");
		}

	}

}
