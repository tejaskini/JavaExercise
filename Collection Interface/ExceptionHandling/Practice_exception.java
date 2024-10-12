package ExceptionHandling;

import java.util.Scanner;

//Simple banking system  to understand Exception
class MyDefaultEx extends Exception {

	MyDefaultEx(String str) {
		super(str);
	}
}

public class Practice_exception {

	int acc = 1234, pass = 1234;
	int amount = 5000;

	public void transactions()
	
	{

		System.out.print("Enter your Account number : ");
		Scanner s = new Scanner(System.in);
		if (s.nextInt() == acc) {


		int option = 0;
		while (option != 3) {
			System.out.println("Press Key for transactions\n 1.Check Balance \n 2. WithdrawCash \n 3.Exit");
			Scanner sc = new Scanner(System.in);
		 option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter the password");
			if (sc.nextInt() == pass) {
				System.out.println(amount);
			} else {
				System.out.println("Wrong password");
			}
			break;

		case 2:
			System.out.println("Withdraw Cash");
			System.out.println("Enter amount ");

			try {
				if (amount > 0) {
				int userCash = sc.nextInt();
					if (userCash > amount) {
						throw new MyDefaultEx("Not sufficient amount !");
					} else {
						amount -= userCash;
						System.out.println("Take Your cash");
						System.out.println("Your balance is now " + amount);
					}

			} else {
					throw new MyDefaultEx("No amount available in account");
			}
		} catch (ArithmeticException | MyDefaultEx e) {
			System.out.println(e);
			}
			break;

		case 3:
			System.out.println("Thank you !");
			break;
		default:
			System.out.println("Invalid input try again.");
			
	
		}
	}
} else {
	System.out.println("Yaad karke aa password");
}
}

	public static void main(String[] args) {

		/*NOTE: This commented code is just for practice use!
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter Your Age, name, Address");
		 * 
		 * int age = sc.nextInt(); String name = sc.next(); String addr = sc.next();
		 * 
		 * List list = new ArrayList();
		 * 
		 * try { list.add(age); list.add(name); list.add(addr);
		 * System.out.println(list);
		 * 
		 * if (age < 18) { throw new
		 * MyDefaultEx("You are not eligible ok Bhai maje kar"); }
		 * 
		 * } catch (Exception e) { System.out.println(e); }
		 * 
		 */

		// ----------------- Another example on useDefinedException

		// Create simple withdrawal process
		Practice_exception ex = new Practice_exception();
		ex.transactions();
		
		

	}

}
