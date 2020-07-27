package execise2;

import java.util.Scanner;

abstract class Account {
	long Account_Number;
	String name;
	double balance = 0;
	
	public void deposit(double amount) {
		System.out.println("Account Deposited "+amount);
		balance+=amount;
	}
	public void withdraw(double amount) {
		System.out.println("Account Withdrawn..."+amount);
		balance+=amount;
	}
	public void displayAccountDetails() {
		System.out.println("Displaying account details...");
		System.out.println("Account no "+Account_Number);
		System.out.println("Name "+ name);
	}
	public void displybalance() {
		System.out.println("Balance is "+ balance);
	}
	
}
final class SB_Account extends Account{}
