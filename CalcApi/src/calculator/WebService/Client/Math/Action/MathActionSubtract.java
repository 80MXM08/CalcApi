package calculator.WebService.Client.Math.Action;

import calculator.WebService.Client.Math.MathAction;

public class MathActionSubtract extends MathAction {

	@Override
	public int doMath(int numberOne, int numberTwo)
	{
		int result = super.client.subtract(numberOne, numberTwo);
		System.out.print(numberOne + " - " + numberTwo + " = ");
		System.out.println(result);
		return result;
	}
}