package com.tejas.CollectionPrac;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TreeSet is directly implemented class of Navigable interface and it indirectly implements the SortedSet and Set Interface.
		// Set s = new TreeSet();
		// SortedSet s = new TreeSet();

		// NavigableSet st = new TreeSet(); //direct

		TreeSet st = new TreeSet();

		st.add(20);
		st.add(40);
		st.add(10);
		st.add(50);
		st.add(100);
		// st.add("dfdf"); // cannot add diff data types
		// st.add(null); // cannot add null values

		System.out.println(st.ceiling(60)); // value greater than passed value in ceiling()
		System.out.println(st.floor(45)); // value smaller than passed value in floor()

		System.out.println(st.pollFirst()); // remove first lowest element
		System.out.println(st.pollLast()); // remove last Highest element

//		System.out.println(st);

		// descendingIterator
//		Iterator decItr = st.descendingIterator();
//		while (decItr.hasNext()) {
//			System.out.println(decItr.next());
//		}

//		Iterator itr = st.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

	}

}
