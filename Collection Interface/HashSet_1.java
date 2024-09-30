package com.tejas.CollectionPrac;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();
		arr.add("JAva");
		arr.add("coding");
		arr.add("learning");

		HashSet hs = new HashSet();
		hs.addAll(arr);// adding arr collection to hashSet
		hs.add("Tejas");
		hs.add(343);
		hs.add('c');
		hs.add(10);
		hs.add(30);
		hs.add(2);

		// cannot add duplicates
		hs.add(30);
		hs.add(null);
		hs.add(null);

		// does not follow insertion and sorting order
		System.out.println(hs);

		System.out.println(hs.contains("baba"));// false
		System.out.println(hs.isEmpty());// false
		System.out.println(hs.remove('c'));// true
		System.out.println(hs.equals(arr));// false
		System.out.println(hs.hashCode());// hashcode of hs 302077974

		System.out.println(hs);

		// print using iterator
//		Iterator itr = hs.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}


	}

}
