package com.tejas.CollectionPrac;

import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		
		// LIFO system
		Stack st = new Stack();
		st.push(33);
		st.push("tej");
		st.push(55.4);
		st.push('c');
		System.out.println(st);

		st.add("kini");
		st.addElement(34343);

		System.out.println("peek " + st.peek()); // c
		// System.out.println(st.capacity());

		System.out.println("pop " + st.pop());
		System.out.println("peek " + st.peek());

		st.push(65);
		System.out.println("stack " + st);
		System.out.println("search " + st.search("kini"));

		System.out.println(st.empty());



	}

}
