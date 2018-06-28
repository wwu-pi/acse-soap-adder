package de.wwu.pi.soapadder;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Remote
@WebService(name="SoapAdderServiceBean")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL)
public interface SoapAdderServiceIF {
	
	@WebMethod
	public int addTwoNumbers(int first, int second);

}