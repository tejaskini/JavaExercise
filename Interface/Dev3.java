package com.tejas.abstraction.intefaces;

public class Dev3 extends Dev2 {

	@Override
	public void loan() {
		System.out.println("No Loan data is there!");
	}

	@Override
	public void account() {
		System.out.println("Saving Account");
	}

	@Override
	public void balanced() {
		System.out.println("Your Balance is : " + 1100);
	}
}
