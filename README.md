#Console-Based Loan Management System

Loan Management System (Java OOP POC) Project Overview

The Loan Management System is a Core Java console application developed to demonstrate Object-Oriented Programming concepts such as Inheritance, Interfaces, Method Reuse, Regular Expressions, Business Logic, and User Input Handling.

The application validates customer details, checks loan eligibility based on predefined business rules, calculates the Rate of Interest (ROI), submits loan documents, and displays customer address information.

This project is intended as a Proof of Concept (POC) for Java interview preparation.

Technologies Used

Java 17/21 Eclipse IDE Core Java Scanner Class Regular Expressions (Regex) OOP Concepts Conditional Statements

Project Structure com.Oops.Inheritance

│ ├── Loan.java // Interface ├── LoanInfo.java // Common implementation ├── HomeLoan.java // Home Loan Module └── PersonalLoan.java // Personal Loan Module OOP Concepts Covered

Interface — Loan.java
Contains common service declarations.

String getAddressDetails();

boolean isPhoneValid();

boolean isAadharValid();

boolean isPANValid();

double getCustomerSalary();

int getCibiScore();

int ageInfo();

double getROI();

Concept:

Abstraction Loose Coupling Contract-Based Programming

Inheritance
HomeLoan extends LoanInfo

PersonalLoan extends LoanInfo

Both loan modules inherit common methods from LoanInfo.

Advantages

Code Reusability Less Code Duplication Easy Maintenance

Common Parent Class — LoanInfo
Contains reusable methods:

Phone Validation PAN Validation Aadhaar Validation Salary Age CIBIL Score Address Details Default ROI

Shared by multiple loan modules.

Business Logic

Each loan type has different eligibility rules.

Home Loan

Age: Above 18 - 75

Minimum Salary: 40000

CIBIL Score: Above 300 - 900

Base ROI: 8.5%

ROI depends on CIBIL Score.

Personal Loan

Age: Above 22 - 60

Minimum Salary: 50000

CIBIL Score: Above 300 - 900

Base ROI: 8.5%

ROI depends on CIBIL Score.

Validation Using Regex

Phone Number

[6-9][0-9]{9}

Example:

9876543210

Aadhaar

[0-9]{12}

Example:

123412341234

PAN

[A-Z]{5}[0-9]{4}[A-Z]

Example:

ABCDE1234F Address Details

The application collects customer address information using the Scanner class.

Address details include:

Flat Number Plot Details Street City State Country

The entered address is displayed after the customer successfully meets the loan eligibility criteria.

Business Flow

Start

↓

Validate Phone

↓

Validate Aadhaar

↓

Validate PAN

↓

Enter Salary

↓

Enter CIBIL Score

↓

Enter Age

↓

Check Eligibility

↓

Submit Loan Documents

↓

Calculate ROI

↓

Collect Address

↓

Display Loan Details

↓

End

Concepts Demonstrated

✔ Interface

✔ Abstraction

✔ Inheritance

✔ IS-A Relationship

✔ Method Reusability

✔ Business Logic

✔ Regex Validation

✔ Scanner Class

✔ Conditional Statements

✔ Nested if-else

✔ Method Calling

✔ Code Reusability

Setup and Run Install Java 17 or Java 21. Open the project in Eclipse IDE. Make sure all Java files are under the com.Oops.Inheritance package. Run HomeLoan.java for Home Loan. Run PersonalLoan.java for Personal Loan. Enter the required customer details in the Eclipse console. Sample Output Welcome to ABCD Home Loan Banking

Enter your phone number : 9876543210

Enter your Aadhar number : 123412341234

Enter your PAN number : ABCDE1234F

Enter your salary : 65000

Enter your Cibil Score : 785

Enter your age : 29

Congratulations !! You are Eligible for Home Loan

Home Loan Documents have been submitted successfully !!

Your Rate of Interest is : 6.5

Enter Your Address Enter flat number: 101

Plot details: ABC Layout

Enter Street: Main Road

Enter City: Hyderabad

Enter State & Country: Telangana India

As you entered your address details are:

Flat Number : 101 Plot Details : ABC Layout Street : Main Road City : Hyderabad State & Country: Telangana,India
