package de.wwi.pi.soapadder;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class SoapAdderServiceBean
 */

@WebService
@Stateless
@LocalBean
public class SoapAdderServiceBean {

    public SoapAdderServiceBean() {
      
    }
    
    @WebMethod
    public int addTwoNumber(int first, int second){
    	return first + second;
    }
}
