package com.assignment.exception;

import java.util.Scanner;

public class ExceptionQ1 {

	public static double divide(int num1, int num2) {
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
			System.out.println("The quotient is " + r);

		} catch (ArithmeticException e) {
			System.out.printf("Can't divide by zero");
		}
	}

}
