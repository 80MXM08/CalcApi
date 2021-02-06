package calculator.WebService.Client.Math.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"multiplyResult"
})
@XmlRootElement(name = "MultiplyResponse")
public class MultiplyResponse {

	@XmlElement(name = "MultiplyResult")
	protected int multiplyResult;


	public int getMultiplyResult() {
		return multiplyResult;
	}


	public void setMultiplyResult(int value) {
		this.multiplyResult = value;
	}

}