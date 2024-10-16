//package com.tejas.collections.Exercise;
// check the given char is Hexadecimal or not
// HexaRunner.java is runner class of this file.
public class Hexadecimal {

	public String str;

	public Hexadecimal(String str) {
		this.str = str;
	}

	public static boolean isHexadecimalChar(char ch) {
		// Check if character is a digit (0-9) or a valid hexadecimal letter (a-f, A-F)
		return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F');
	}

	public boolean isHexadecimal() {
		if (str == null || str.isEmpty()) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (!isHexadecimalChar(ch)) {
				return false;
			}
		}
		return true;
	}
}
