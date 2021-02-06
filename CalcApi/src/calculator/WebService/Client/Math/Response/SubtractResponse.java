package calculator.WebService.Client.Math.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"subtractResult"
})
@XmlRootElement(name = "SubtractResponse")
public class SubtractResponse {

	@XmlElement(name = "SubtractResult")
	protected int subtractResult;

	public int getSubtractResult() {
		return subtractResult;
	}

	public void setSubtractResult(int value) {
		this.subtractResult = value;
	}

}