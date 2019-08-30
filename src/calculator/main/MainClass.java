package calculator.main;

import java.util.*;

import calculator.operation.*;

import calculator.operation.Operations;

public class MainClass {

	public static void main(String args[]) {
		String operation = "-";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Operation: ");
		operation = scanner.next();

		Operations operations = new Operations();

		operations.getOperation(operation);

	}
}
