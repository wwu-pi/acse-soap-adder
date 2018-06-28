package de.wwu.pi.soapadder;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Session Bean implementation class SoapAdderServiceBean
 */

@Stateless
@Remote(SoapAdderServiceIF.class)
@WebService(endpointInterface="de.wwu.pi.soapadder.SoapAdderServiceIF")
public class SoapAdderServiceBean implements SoapAdderServiceIF {
    
    public int addTwoNumbers(int first, int second){
    	return first + second;
    }
}
