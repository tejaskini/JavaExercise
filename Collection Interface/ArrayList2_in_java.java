package com.tejas.CollectionPrac;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2_in_java {

	public static void main(String[] args) {

		/*
		 * ArrayList is implementd class of List // present in java.util.--- - resizable
		 * array - allow duplication - follow insertion order - does not follow sorting
		 * order - non- synchronized
		 * 
		 */

		// create ArrayList
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Tejas");
		ar1.add("Ujjval");
		ar1.add("Sakshi");
		ar1.add("Shruti");
		ar1.add("jay");
		System.out.println("Original Array" + ar1);

		// Operations on ArrayList

		// get and set methods
		ar1.set(3, "Apple");
		System.out.println(ar1.get(3));

		// Sort Array
		/*
		 * The java.util package provides a utility class Collections, which has the
		 * static method sort(). Using the Collections.sort() method, we can easily sort
		 * the ArrayList.
		 */

		Collections.sort(ar1);
		System.out.println("After Collections.sort() - " + ar1);

		// for Integer arr
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(20);
		intArr.add(55);
		intArr.add(32);
		intArr.add(9);
		intArr.add(6);

		Collections.sort(intArr);
		System.out.println("Sorted arr " + intArr);

		intArr.remove(0);
		System.out.println(intArr);

	}

}
