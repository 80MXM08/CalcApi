package calculator.WebService.Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SoapMessageLoggingHandlerImpl implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext context) {
		try {
			SOAPMessage soapMsg = context.getMessage();
			soapMsg.writeTo(System.out);
		} catch (SOAPException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

		return true;
	}

	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	public void close(MessageContext context) {

	}

	public Set<QName> getHeaders() {
		return null;
	}
	public static void addSoapMsgLoggingHandler(Service service) {
		service.setHandlerResolver(portInfo -> {
			List<Handler> handlerList = new ArrayList<>();
			handlerList.add(new SoapMessageLoggingHandlerImpl());
			return handlerList;
		});
	}
}