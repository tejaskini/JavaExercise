package Synchronization;

import java.util.Scanner;

abstract class CustomerData {
	abstract void custProc();

	abstract void savingAcc(int withdraw);
}

class CustomerProcess extends CustomerData implements Runnable {
	private int withdraw;
	private static int availableBalance = 15000; // shared amount across all threads

	@Override
	public void run() {
		synchronized (this) {

			synchronized (CustomerProcess.class) {
			custProc();
			}
//			notify();
		}
	}

	@Override
	public void custProc() {
		int acc, pin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number:");
		acc = sc.nextInt();
		System.out.println("Enter pin");
		pin = sc.nextInt();

		System.out.println("Enter amount to withdraw:");
		withdraw = sc.nextInt();
		savingAcc(withdraw);
	}

	@Override
	synchronized void savingAcc(int amount) {
		if (amount <= availableBalance) {
			availableBalance -= amount;
			System.out.println(amount + " withdrawn. Remaining balance: " + availableBalance);
			System.out.println("Your transaction is completed!");
		} else {
			System.out.println("Insufficient balance!!");
		}
	}
}

public class BankSystemMain {
	public static void main(String[] args) {
		CustomerProcess customer1 = new CustomerProcess();
		CustomerProcess customer2 = new CustomerProcess();

		Thread t1 = new Thread(customer1);
		Thread t2 = new Thread(customer2);

		// Start threads
		t1.start();
		t2.start();

		// Wait for threads to finish
		try {
			t1.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
