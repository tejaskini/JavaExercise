package com.tejas.CollectionPrac;

import java.util.Vector;

public class Vectors_1 {

	public static void main(String[] args) {

		Vector v = new Vector(); // initial capacity is 10;

		// Vector v1 = new Vector(10, 2); // initial capacity is 10*2; increment by
		// double

		v.add("tejas"); // method of collection
		v.add(1, "kini"); // m of List
		v.addElement(23); // m of Vector
		v.add(23.3);
		v.add('c');
		v.addElement("Palghar");
		v.add(null);

		v.setElementAt("DFDFd", 4);

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.remove(0));
		System.out.println(v.removeElement(23.3));

		v.removeElementAt(3);
		System.out.println(v);
		System.out.println(v.capacity());

			
		
	}

}
