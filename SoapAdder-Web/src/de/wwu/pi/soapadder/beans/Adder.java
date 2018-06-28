package de.wwu.pi.soapadder.beans;

import javax.xml.ws.BindingProvider;

import de.wwu.pi.soapadder.client.SoapAdderServiceBean;
import de.wwu.pi.soapadder.client.SoapAdderServiceBeanService;

public class Adder {

	public static void main(String[] args) {
		SoapAdderServiceBeanService service = new SoapAdderServiceBeanService();
		SoapAdderServiceBean adder = service.getSoapAdderServiceBeanPort();
		
		// Set fixed binding to localhost/Docker-IP if using Docker 
		BindingProvider bindingProvider = (BindingProvider) adder;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
		      "http://localhost:8080/SoapService/SoapAdderServiceBean");
		
		int result = adder.addTwoNumbers(41,1);
		System.out.println("Result: "+result);
	}

}
