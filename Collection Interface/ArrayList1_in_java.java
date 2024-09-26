package com.tejas.CollectionPrac;

import java.util.ArrayList;

public class ArrayList1_in_java {

	public static void main(String[] args) {

		/*
		 * ArrayList is implementd class of List // present in java.util.--- - resizable
		 * array - allow duplication - follow insertion order - does not follow sorting
		 * order - non- synchronized
		 * 
		 */

		// crate ArrayList
		ArrayList arr1 = new ArrayList();// create Initial capacity 10 by default
		// ArrayList arr2 = new ArrayList(6); // we can also create with 6 size arr
//		arr1.add(index, element)
		arr1.add(0, 10);
		arr1.add(1, 20);
		arr1.add(2, 40);
		arr1.add(3, 10);

		// create another ArrayList
		ArrayList ar2 = new ArrayList(arr1); // collection c
		ar2.add(70);
		ar2.add("Tejas");
		ar2.add(55);

		// System.out.println(ar2);// [10, 20, 40, 10, 70, 89, 55]

		ArrayList ar3 = new ArrayList();
		ar3.addAll(ar2);
		System.out.println(ar3);
		ar3.remove(2);

		System.out.println(ar3);
	}

}
