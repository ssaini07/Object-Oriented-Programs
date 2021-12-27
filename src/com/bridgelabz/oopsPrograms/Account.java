package com.bridgelabz.oopsPrograms;

import java.util.Scanner;

public class Account {

	// int accountBalance;

	public void debit() {
		Scanner sc = new Scanner(System.in);
		int debitAmount;
		int accountBalance;
		System.out.println("Enter amount to be debited");
		debitAmount = sc.nextInt();
		System.out.println("Enter the amount balance");
		accountBalance = sc.nextInt();

		if (debitAmount < accountBalance) {
			accountBalance = accountBalance - debitAmount;
			System.out.println("Amount after debited: " + debitAmount);
			System.out.println("Updated account balance: " + accountBalance);
		} else {
			System.out.println("Sorry debited amount is greater than account balance. so it can't proceed");
		}
	}

	public static void main(String[] args) {
		Account account = new Account();
		account.debit();

	}

}
