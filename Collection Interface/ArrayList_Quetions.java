package com.tejas.CollectionPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Quetions {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		/*
		 * 1. Write a Java program to create an array list, add some colors (strings)
		 * and print out the collection.
		 */
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Green");
		colors.add("White");
		colors.add("Black");
		colors.add("brown");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		
		System.out.println("--------------Print elements of Array--------------");
		Iterator itr = colors.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


		System.out.println("--------------search elmnts--------------");

		// search given elements
		// System.out.println(colors.contains(sc.next()) + " is present");
		System.out.println(colors.contains("Green"));


		System.out.println("---------------shuffle array-------------");
		// shuffle the array
		Collections.shuffle(colors);
		System.out.println(colors);


		System.out.println("---------------Clone ArrayList-------------");

		// clone the arraylist
		ArrayList<String> newList = (ArrayList<String>) colors.clone();
		System.out.println(newList);


		System.out.println("----------------Reverse ArrayList------------");
		// Reverse element in ArrayList
		Collections.reverse(newList);
		System.out.println("Reverse List: " + newList);


		System.out.println("----------------Compare ArrayList------------");
		// compare two arrayList
		System.out.println(colors.equals(newList));

		System.out.println("---------------Extracting ArrayList-------------");
		// Extracting portion of ArrayList
		System.out.println(newList.subList(2, 4));

		System.out.println("---------------swap elements-------------");
		Collections.swap(colors, 2, 4);
		System.out.println(colors);

	}

}

/*
    output: 
--------------Print elements of Array--------------
Green
White
Black
brown
Blue
Red
Yellow
--------------search elmnts--------------
true
---------------shuffle array-------------
[Yellow, Black, brown, Green, White, Blue, Red]
---------------Clone ArrayList-------------
[Yellow, Black, brown, Green, White, Blue, Red]
----------------Reverse ArrayList------------
Reverse List: [Red, Blue, White, Green, brown, Black, Yellow]
----------------Compare ArrayList------------
false
---------------Extracting ArrayList-------------
[White, Green]
---------------swap elements-------------
[Yellow, Black, White, Green, brown, Blue, Red]

*/
