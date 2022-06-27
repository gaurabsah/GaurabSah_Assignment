package com.assignment.stringbuilder;

public class StringBuild {

	public static void main(String[] args) {

//		Q1
		String a = "StringBuffer";
		String b = "is a peer class of String";
		String c = "that provides much of";
		String d = "the functionality of strings";
		StringBuilder q = new StringBuilder();
		q.append(a);
		q.append(" " + b);
		q.append(" " + c);
		q.append(" " + d);
		System.out.println(q);

//		Q2
		StringBuilder s1 = new StringBuilder("It is used to at the specified index");
		s1.insert(14, "insert text ");
		System.out.println(s1);

//		Q3
		StringBuilder s2 = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(s2.reverse());

	}

}
