//package com.tejas.collections.Exercise;
//Run : open cmd : javac AnagramRunner.java
//					java AnagramRunner

import java.util.Arrays;

public class AnagramRunner {

	public static String areAnagram(String str1, String str2) {

		if (str1 == null || str2 == null) {
			return "String is null!";
		}
		if (str1.length() != str2.length()) {

			return "Lenght should be the same!";
		}

		String lowercaseStr1 = str1.toLowerCase();
		String lowercaseStr2 = str2.toLowerCase();

		char[] char1 = lowercaseStr1.toCharArray();
		char[] char2 = lowercaseStr2.toCharArray();

		// sort the arrays
		Arrays.sort(char1);
		Arrays.sort(char2);
		if (Arrays.equals(char1, char2)) {
			return "String are Anagrams";
		}
		return "String are not Anagram";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * To check the string is Anagram or not Anagram :- word make by rearranging the
		 * another word Listen and silent - is anagram
		 */

//		Anagram an = new Anagram();
		System.out.println(areAnagram("Hello", "elloh"));
	}

}
