package com.tejas.FunctionalProgramming;

import java.util.List;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(2, 4, 5, 3, 7, 8);
// print the sum of list 
		int sum = numbers.stream().reduce(0, (n1, n2) -> n1 + n2);

		System.out.println(sum);
		
		
	}

}
