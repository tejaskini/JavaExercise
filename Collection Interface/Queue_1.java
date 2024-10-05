package com.tejas.CollectionPrac;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_1 {
	public static void main(String[] args) {

		Queue q = new PriorityQueue();
		q.add(11);
		//q.add("tejas");
		q.add(55);
		q.add(5);
		q.add(7);
		q.add(4);


		// follows Insertion order

		// methods
		q.offer(30);
		q.add(30);

		System.out.println(q.element()); // retrieve head not remove

		System.out.println(q);
	}

}
