package com.tejas.CollectionPrac;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_in_java {

	public static void main(String[] args) {

		// Enumeration can be used for Legacy classes only - Vector and Stack

		Vector v = new Vector();
		v.add(10);
		v.add("Tejas");
		v.add(20.22);

//		System.out.println(v);
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
