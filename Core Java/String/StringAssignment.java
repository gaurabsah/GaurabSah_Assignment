package com.assignment.string;

public class StringAssignment {
	// Q1
	static int lengthOfString() {
		String str = "Hello World";
		return str.length();
	}

	// Q2
	static String mergeOfStrings() {
		String str1 = "Hello,";
		String str2 = "How are you?";
		return str1.concat(str2);
	}

	public static void main(String[] args) {

		System.out.println(lengthOfString());
		System.out.println(mergeOfStrings());

	}

}
