
package de.wwu.pi.soapadder.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapAdderServiceBean", targetNamespace = "http://soapadder.pi.wwu.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapAdderServiceBean {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addTwoNumbers", targetNamespace = "http://soapadder.pi.wwu.de/", className = "de.wwu.pi.soapadder.client.AddTwoNumbers")
    @ResponseWrapper(localName = "addTwoNumbersResponse", targetNamespace = "http://soapadder.pi.wwu.de/", className = "de.wwu.pi.soapadder.client.AddTwoNumbersResponse")
    public int addTwoNumbers(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
