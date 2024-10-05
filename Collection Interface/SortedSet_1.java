package com.tejas.CollectionPrac;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_1 {

	public static void main(String[] args) {

		SortedSet<Integer> sset = new TreeSet<Integer>();
		sset.add(4);
		sset.add(3);
		sset.add(5);
		sset.add(2);
		sset.add(2);

		System.out.println(sset.headSet(4));// before element 4
		System.out.println(sset.tailSet(4));// after element 4

		Iterator itr = sset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
