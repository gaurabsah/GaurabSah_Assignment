package com.assignment.exception;

import java.util.Scanner;

public class ExceptionQ2 {
	public static double divide(int num1, int num2) throws UnsupportedOperationException {
		if (num2 == 0) {
			throw new UnsupportedOperationException("Exception");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = s.nextInt();
		System.out.println("Enter num2: ");
		int num2 = s.nextInt();
		try {
			double r = divide(num1, num2);
			System.out.println("The quotient is: " + r);
		} catch (UnsupportedOperationException e) {
			System.out.printf("Can't divide by zero");
		}
	}

}

class UnsupportedOperationException extends Exception {
	UnsupportedOperationException(String exception) {
		super(exception);
	}

}
