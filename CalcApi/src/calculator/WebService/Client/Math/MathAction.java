package calculator.WebService.Client.Math;

import calculator.WebService.Client.Calculator;
import calculator.WebService.Client.CalculatorSoap;
import calculator.WebService.Client.SoapMessageLoggingHandlerImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"intA",
		"intB"
})
public abstract class MathAction {

	@XmlTransient
	protected final Calculator calculator = new Calculator();
	@XmlTransient
	protected CalculatorSoap client;

	public MathAction() {
		SoapMessageLoggingHandlerImpl.addSoapMsgLoggingHandler(calculator);
		client = calculator.getCalculatorSoap12();
	}

	@XmlElement(name = "intA")
	protected int intA;
	@XmlElement(name = "intB")
	protected int intB;

	public abstract int doMath(int numberOne, int numberTwo);
}