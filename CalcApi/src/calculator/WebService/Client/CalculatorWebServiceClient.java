package calculator.WebService.Client;

import calculator.WebService.Client.Math.MATHACTIONTYPE;
import calculator.WebService.Client.Math.MathAction;

import java.io.IOException;

public class CalculatorWebServiceClient {

	private static int readInt() throws IOException {
		String str = "";
		char c;
		while (true) {
			c = (char) System.in.read();
			if ((c == '\n') || (c == ' ')) {
				break;
			}
			str += c;
		}
		Integer n = new Integer(str.trim());
		return n.intValue();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("1 --- Add:");
		System.out.println("2 --- Subtract:");
		System.out.println("3 --- Multiply:");
		System.out.println("4 --- Divide:");
		int input;

		while (true) {
			System.out.println("Input action:");
			input = readInt();
			if (input == 0) {
				System.out.print("So, you have chosen death... ");
				System.exit(8008135);
			}
			System.out.print("Inputted action: ");
			System.out.println(MATHACTIONTYPE.getActionType(input).name());

			int numberOne;
			int numberTwo;

			System.out.println("Enter first number: ");
			numberOne = readInt();
			System.out.print("First number: ");
			System.out.println(numberOne);

			System.out.println("Enter second number: ");
			numberTwo = readInt();
			System.out.print("Second number: ");
			System.out.println(numberTwo);

			MathAction action = MathActionFactory.buildMathAction(MATHACTIONTYPE.getActionType(input));
			action.doMath(numberOne, numberTwo);
		}
	}
}