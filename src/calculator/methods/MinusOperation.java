package calculator.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class MinusOperation {

	Scanner scanner = new Scanner(System.in);

	public String performSubtraction() {
		System.out.println("Minus operation");

		ArrayList<String> numbers = new ArrayList<>();

		String enterNumber;
		double Difference = 0;

		for (int x = 0; x < 3; x++) {
			System.out.print("Please enter number: ");
			enterNumber = scanner.next();
			numbers.add(enterNumber);
		}

		Difference = Double.parseDouble(numbers.get(0))
				- Math.pow(Double.parseDouble(numbers.get(1)), Double.parseDouble(numbers.get(2)));

		return "Difference is " + Difference;
	}
}
