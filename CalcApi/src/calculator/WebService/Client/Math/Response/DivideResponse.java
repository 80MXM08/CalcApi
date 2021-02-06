package calculator.WebService.Client.Math.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"divideResult"
})
@XmlRootElement(name = "DivideResponse")
public class DivideResponse {

	@XmlElement(name = "DivideResult")
	protected int divideResult;


	public int getDivideResult() {
		return divideResult;
	}

	public void setDivideResult(int value) {
		this.divideResult = value;
	}

}