package de.wwu.pi.soapadder;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Remote
@WebService
public interface SoapAdderServiceIF {
	@WebMethod
	public int addTwoNumbers(int first, int second);

}