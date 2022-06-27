package com.assignment.stringbuffer;

public class StringBuff {

	public static void main(String[] args) {
//		Q1
		String a = "StringBuffer";
		String b = "is a peer class of String";
		String c = "that provides much of";
		String d = "the functionality of strings";
		StringBuffer p = new StringBuffer();
		p.append(a);
		p.append(" " + b);
		p.append(" " + c);
		p.append(" " + d);
		System.out.println(p);

//		Q2
		StringBuffer in = new StringBuffer("It is used to at the specified index");
		in.insert(14, "insert text ");
		System.out.println(in);

//		Q3
		StringBuffer rev = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(rev.reverse());

	}

}
