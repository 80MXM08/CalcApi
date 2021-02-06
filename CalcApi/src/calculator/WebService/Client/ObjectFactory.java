package calculator.WebService.Client;


import calculator.WebService.Client.Math.Action.MathActionAdd;
import calculator.WebService.Client.Math.Action.MathActionDivide;
import calculator.WebService.Client.Math.Action.MathActionMultiply;
import calculator.WebService.Client.Math.Action.MathActionSubtract;
import calculator.WebService.Client.Math.Response.AddResponse;
import calculator.WebService.Client.Math.Response.DivideResponse;
import calculator.WebService.Client.Math.Response.MultiplyResponse;
import calculator.WebService.Client.Math.Response.SubtractResponse;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public MathActionAdd createAdd() {
		return new MathActionAdd();
	}

	public MathActionDivide createDivide() {
		return new MathActionDivide();
	}

	public MultiplyResponse createMultiplyResponse() {
		return new MultiplyResponse();
	}

	public DivideResponse createDivideResponse() {
		return new DivideResponse();
	}

	public SubtractResponse createSubtractResponse() {
		return new SubtractResponse();
	}

	public MathActionMultiply createMultiply() {
		return new MathActionMultiply();
	}

	public MathActionSubtract createSubtract() {
		return new MathActionSubtract();
	}

	public AddResponse createAddResponse() {
		return new AddResponse();
	}

}