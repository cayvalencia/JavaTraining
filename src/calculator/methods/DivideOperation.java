package calculator.methods;

import java.util.Scanner;

public class DivideOperation {

	Scanner scanner = new Scanner(System.in);

	public String performDivision() {
		System.out.println("Division operation");

		System.out.print("Please enter number: ");
		int num1 = scanner.nextInt();
		System.out.print("Please enter number: ");
		int num2 = scanner.nextInt();

		double remainder = 0;

		remainder = num1 % num2;

		return "Remainder of " + num1 + "/" + num2 + " is " + (int) remainder;
	}
}
