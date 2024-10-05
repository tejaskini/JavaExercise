package com.tejas.CollectionPrac;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_1 {

	public static void main(String[] args) {


		NavigableSet nst = new TreeSet();
		nst.add(10);
		nst.add(70);
		nst.add(20);
		nst.add(30);
		nst.add(40);
		nst.add(50);
		nst.add(60);
		
		ArrayList arr = new ArrayList();
		arr.addAll(nst);
//		arr.add(55);
//		arr.add(44);

		System.out.println(new ArrayList<>(nst).equals(arr)); // true
		System.out.println(arr);
		System.out.println(nst);

		System.out.println(nst.descendingSet());

		System.out.println(nst.tailSet(30, false));

		System.out.println(nst.lower(50));
		System.out.println(nst.higher(50));
		System.out.println(nst.ceiling(76));

		System.out.println(nst.pollFirst());
		System.out.println(nst.pollLast());


	}

}