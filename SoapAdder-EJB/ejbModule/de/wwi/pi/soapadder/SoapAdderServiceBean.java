package de.wwi.pi.soapadder;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Session Bean implementation class SoapAdderServiceBean
 */

@Stateless
@WebService(name="SoapAdderServiceBean")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL)
public class SoapAdderServiceBean {

    public SoapAdderServiceBean() {
      
    }
    
    @WebMethod
    public int addTwoNumber(int first, int second){
    	return first + second;
    }
}
