package calculator.methods;

import java.util.Scanner;

public class TimesOperation {
	Scanner scanner = new Scanner(System.in);

	public String performMultiplication() {
		System.out.println("Multiply operation");

		System.out.print("Please enter number: ");
		int num1 = scanner.nextInt();
		System.out.print("Please enter number: ");
		int num2 = scanner.nextInt();

		int product = 0;

		String output = "";

		for (int x = 1; x <= num2; x++) {

			product = num1 * x;
			output = output + num1 + "x" + x + " = " + product + "\n";
		}

		return output;
	}
}
