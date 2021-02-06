package calculator.WebService.test;

import calculator.WebService.Client.Math.MATHACTIONTYPE;
import calculator.WebService.Client.Math.MathAction;
import calculator.WebService.Client.MathActionFactory;
import org.junit.Assert;
import org.junit.Test;

public class MathActionFactoryTest {

	@Test
	public void addResultEqualToEleven() {
		MathAction action = MathActionFactory.buildMathAction(MATHACTIONTYPE.ADD);
		int result = action.doMath(4, 7);
		Assert.assertEquals(11, result);
	}

	@Test
	public void divideResultEqualToFive() {
		MathAction action = MathActionFactory.buildMathAction(MATHACTIONTYPE.DIVIDE);
		int result = action.doMath(40, 8);
		Assert.assertEquals(5, result);
	}

	@Test
	public void multiplyResultEqualToForty() {
		MathAction action = MathActionFactory.buildMathAction(MATHACTIONTYPE.MULTIPLY);
		int result = action.doMath(5, 8);
		Assert.assertEquals(40, result);
	}

	@Test
	public void subtractResultEqualTo4() {
		MathAction action = MathActionFactory.buildMathAction(MATHACTIONTYPE.SUBTRACT);
		int result = action.doMath(18, 14);
		Assert.assertEquals(4, result);
	}
}