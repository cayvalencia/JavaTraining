package calculator.methods;

import java.util.ArrayList;


import java.util.*;

public class PlusOperation {

	Scanner scanner = new Scanner(System.in);

	public String performAddition() {

		System.out.println("Plus operation");

		ArrayList<String> numbers = new ArrayList<>();

		String enterNumber;
		int Sum = 0;

		for (int x = 0; x < 10; x++) {
			System.out.print("Please enter number: ");
			enterNumber = scanner.next();

			if (!enterNumber.equals("END")) {
				numbers.add(enterNumber);
				Sum += Integer.parseInt(enterNumber);
			} else {
				break;
			}
		}

		return "Sum is " + Sum;
	}

}
