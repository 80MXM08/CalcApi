package calculator.WebService.Client.Math;

import calculator.WebService.Client.Math.Exception.MathActionTypeNotFoundException;

public enum MATHACTIONTYPE {
	ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4);

	private final int value;

	MATHACTIONTYPE(int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return value;
	}

	public static MATHACTIONTYPE getActionType(int i)
	{
		for(MATHACTIONTYPE type : MATHACTIONTYPE.values())
		{
			if(type.value==i) return type;
		}
		throw new MathActionTypeNotFoundException("Math action not implemented!");
	}
}
