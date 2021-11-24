package calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number1");
		number1 = sc.nextInt();
		System.out.println("Enter a number2");
		number2 = sc.nextInt();

		System.out.println("Arithmetic experssion of two numbers");

		System.out.println("Addition of two numbers = " + (number1 + number2));
		System.out.println("Subtration of two numbers = " + (number1 - number2));
		System.out.println("Multiplication of two numbers = " + (number1 * number2));
		System.out.println("Division of two numbers = " + (number1 / number2));

	}

}
