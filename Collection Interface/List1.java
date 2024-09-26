package com.tejas.CollectionPrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(19); // by default 0 index
		list.add(1, 10);// with index
		list.add(33);
		list.add(10); // can stores duplications
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list);

		// set
		Set set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(800); // duplication not allow
		set.add(55);
		set.add(null); // only one null elements stores
		set.add(null);



		System.out.println("--------Iterator FD for set----------");
		// for set

		Iterator itr1 = set.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// we can remove also
		set.remove(800);
		System.out.println(set);

		System.out.println("---------Iterator FD for List--------");

		// for list
		// 1. using Iterator()
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


		System.out.println("---------ListIterator FD for List--------");


		// 2. using ListIterator
		ListIterator litr = list.listIterator();
		// forward elements
		while (litr.hasNext())

		{
			System.out.println(litr.next());
		}

		System.out.println("--------ListIterator BD for List----------");
		// previous elements
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		// we can also remove elements
		list.remove(null);
		System.out.println(list);


	}

}
