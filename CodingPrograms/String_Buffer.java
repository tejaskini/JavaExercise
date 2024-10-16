package Thread_Exception_Gernerics;

import java.util.Scanner;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String, StringBuffer, and StringBuilder. The String class is an immutable
		 * class whereas StringBuffer and StringBuilder classes are mutable.
		 */

		/*
		 * SBfr - synchronized/threadSafe/leffEfficeint/1.0v SBld- non---/not
		 * treadSafe/more eff/ 1.5v
		 * 
		 */
		
		
		
//		String str = " Java Full Stack ";
//		System.out.println(str.toUpperCase());
//		System.out.println(str.trim());
//		System.out.println(str);

//		StringBuffer bf = new StringBuffer("Advance Java");
//
//		bf.append(" Data");
//
//		bf.insert(0, "Tejas");
//
//		// bf.reverse();
//		bf.replace(2, 5, "HTML");
//
//		bf.delete(2, 6);//
//
//		System.out.println(bf.capacity());
//
//		System.out.println(bf.length());
//		System.out.println(bf.charAt(4));
//
//		System.out.println(bf);

		
		
		// Real life exampale using StringBuffer

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");

		StringBuffer bf = new StringBuffer(sc.next());
		
		System.out.println("You have to modify your name ?");
		char c = sc.next().charAt(0);
		
		switch (c) {
		case 'Y':
			System.out.println("now, you can modify your name : ");
			bf.replace(0, bf.length(), sc.next());
			System.out.println("Your name is changed to :  " + bf);
			break;
		case 'N':
			System.out.println("Thank Your!");
			break;
		default:
			System.out.println("Enter the valid optoion(Y/N) ");
			break;

		}
		
		System.out.println("\n");
		System.out.println("your name is " + bf);

	}

}
