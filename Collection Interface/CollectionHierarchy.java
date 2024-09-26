package com.tejas.CollectionPrac;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

//----------------- Collection Hierarchy -------------------
public class CollectionHierarchy {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Tejas");
		al.add(88);
		al.add('c');

		HashSet hs = new HashSet();
		hs.add("Learning");
		hs.add(99);
		hs.add('c');
		hs.add(true);

		List l = new ArrayList();
		List l2 = new LinkedList();
		List l3 = new Vector();
		List l4 = new Stack();
		Vector v1 = new Stack();

		Set s1 = new HashSet();
		Set s2 = new LinkedHashSet();
		Set s5 = new TreeSet()
		SortedSet s3 = new TreeSet();
		NavigableSet s4 = new TreeSet();

		Queue q1 = new PriorityQueue();
		Deque d1 = new ArrayDeque();

		// -------------Map ------------

		Map m1 = new HashMap();
		Map m2 = new LinkedHashMap();
		HashMap hs1 = new LinkedHashMap();

		Map m3 = new IdentityHashMap();
		Map m4 = new WeakHashMap();

		SortedMap s5 = new TreeMap();
		NavigableMap s6 = new TreeMap();

		Hashtable ht = new Hashtable();

	}

}
