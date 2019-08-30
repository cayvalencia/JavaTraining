package calculator.operation;

import calculator.methods.*;

public class Operations {

	public void getOperation(String operation) {

		if (String.valueOf(operation).equals("+")) {

			PlusOperation plus = new PlusOperation();
			System.out.print(plus.performAddition());

		} else if (String.valueOf(operation).equals("-")) {

			MinusOperation minus = new MinusOperation();
			System.out.print(minus.performSubtraction());
			
		} else if (String.valueOf(operation).equals("*")) {
			
			TimesOperation times = new TimesOperation();
			System.out.print(times.performMultiplication());
			
		} else if (String.valueOf(operation).equals("/")) {
			
			DivideOperation divide = new DivideOperation();
			System.out.print(divide.performDivision());
			
		} else {
			
			System.out.print("Invalid operation");
		
		}

	}
}
