package com.tejas.CollectionPrac;

import java.util.TreeMap;

public class TreeMap_1 {

	public static void main(String[] args) {


		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(102, "Harsh");
		tm.put(101, "Tejas");
		tm.put(108, "Sakshi");
		tm.put(103, "Pranay");
		tm.put(105, "Sujal");
		
		System.out.println(tm.ceilingEntry(104)); // greater value
		System.out.println(tm.floorEntry(104)); // lesser value

		System.out.println(tm.containsKey(108)); // check key

		System.out.println(tm.get(108)); // get value by key

		System.out.println(tm.descendingKeySet()); // prints key in desc order

		System.out.println(tm.headMap(105, false));// print lesser elements with/ without given element

		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());




	}

}
