package calculator.WebService.Client;

import calculator.WebService.Client.Math.Action.MathActionAdd;
import calculator.WebService.Client.Math.Action.MathActionDivide;
import calculator.WebService.Client.Math.Action.MathActionMultiply;
import calculator.WebService.Client.Math.Action.MathActionSubtract;
import calculator.WebService.Client.Math.Exception.MathActionTypeNotFoundException;
import calculator.WebService.Client.Math.MathAction;
import calculator.WebService.Client.Math.MATHACTIONTYPE;

public class MathActionFactory {

	public static MathAction buildMathAction(MATHACTIONTYPE mathActionType) throws MathActionTypeNotFoundException {
		MathAction mathAction = null;

		switch (mathActionType) {
		case ADD:
			mathAction = new MathActionAdd();
			break;
		case SUBTRACT:
			mathAction = new MathActionSubtract();
			break;
		case MULTIPLY:
			mathAction = new MathActionMultiply();
			break;
		case DIVIDE:
			mathAction = new MathActionDivide();
			break;
		default:
			throw new MathActionTypeNotFoundException("Math Action not implemented!");
		}
		return mathAction;
	}
}
