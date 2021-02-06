package calculator.WebService.Client.Math.Response;

import calculator.WebService.Client.Math.MathResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"addResult"
})
@XmlRootElement(name = "AddResponse")
public class AddResponse {

	@XmlElement(name = "AddResult")
	protected int addResult;

	public int getAddResult() {
		return addResult;
	}
	public void setAddResult(int value) {
		this.addResult = value;
	}

}