package de.wwu.pi.soap.adder.beans;

import de.wwu.pi.soap.adder.client.SoapAdderServiceBean;
import de.wwu.pi.soap.adder.client.SoapAdderServiceBeanService;
import de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceLocator;

public class Adder {

	public static void main(String[] args) {
		SoapAdderServiceBeanService service = new SoapAdderServiceBeanServiceLocator();
		try {
			SoapAdderServiceBean adder = service.getSoapAdderServiceBeanPort();
			int result = adder.addTwoNumber(41,1);
	        System.out.println("Result: "+result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
