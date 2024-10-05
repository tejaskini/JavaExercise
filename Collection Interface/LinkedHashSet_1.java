package com.tejas.CollectionPrac;

import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

	public static void main(String[] args) {
	
		LinkedHashSet st = new LinkedHashSet();
		st.add(45);
		st.add("tejas");
		st.add('c');
		System.out.println(st);
		
		st.remove(45);
		System.out.println(st);

		
		}
	}


