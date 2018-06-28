package de.wwu.pi.soapadder;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Session Bean implementation class SoapAdderServiceBean
 */

@Stateless
@Remote(SoapAdderServiceIF.class)
@WebService(name="SoapAdderServiceBean", endpointInterface="de.wwi.pi.soapadder.SoapAdderServiceIF")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL)
public class SoapAdderServiceBean implements SoapAdderServiceIF {
    
    @WebMethod
    public int addTwoNumbers(int first, int second){
    	return first + second;
    }
}
