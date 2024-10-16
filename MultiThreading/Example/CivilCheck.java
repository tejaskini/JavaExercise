package MultiThreading;

import java.util.Scanner;

public class CivilCheck extends Thread {
	Scanner sc = new Scanner(System.in);

	@Override
	public void run() {
		System.out.println("Enter Your civil score!");
		int civil = sc.nextInt();
		if (civil > 750 && civil <= 900) {
			System.out.println("Your are eligible for the loan !");
		} else if (civil >= 300 && civil < 751) {
			System.out.println("You get minimum amount as per the bank norms!");
		} else {
			System.out.println("you are not eligible for loan!");
		}
	}
}
