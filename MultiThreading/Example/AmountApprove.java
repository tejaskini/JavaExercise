package MultiThreading;

import java.util.Scanner;

public class AmountApprove extends Thread {
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Loan Amount for approval:");
		long amt = sc.nextLong();

		if (amt > 500000) {
			System.out.println("Checking civil score for high loan amount...");
		} else {
			System.out.println("Checking civil score for lower loan amount...");
		}

		// Start a new thread for civil score check
		CivilCheck civilThread = new CivilCheck();
		civilThread.start();

		try {
			civilThread.join(); // Wait for civil score check to complete
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Loan approval process completed.");
	}
}
