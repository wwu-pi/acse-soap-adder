package de.wwu.pi.soap.adder.client;

public class SoapAdderServiceBeanProxy implements de.wwu.pi.soap.adder.client.SoapAdderServiceBean {
  private String _endpoint = null;
  private de.wwu.pi.soap.adder.client.SoapAdderServiceBean soapAdderServiceBean = null;
  
  public SoapAdderServiceBeanProxy() {
    _initSoapAdderServiceBeanProxy();
  }
  
  public SoapAdderServiceBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapAdderServiceBeanProxy();
  }
  
  private void _initSoapAdderServiceBeanProxy() {
    try {
      soapAdderServiceBean = (new de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceLocator()).getSoapAdderServiceBeanPort();
      if (soapAdderServiceBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soapAdderServiceBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soapAdderServiceBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soapAdderServiceBean != null)
      ((javax.xml.rpc.Stub)soapAdderServiceBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public de.wwu.pi.soap.adder.client.SoapAdderServiceBean getSoapAdderServiceBean() {
    if (soapAdderServiceBean == null)
      _initSoapAdderServiceBeanProxy();
    return soapAdderServiceBean;
  }
  
  public int addTwoNumber(int arg0, int arg1) throws java.rmi.RemoteException{
    if (soapAdderServiceBean == null)
      _initSoapAdderServiceBeanProxy();
    return soapAdderServiceBean.addTwoNumber(arg0, arg1);
  }
  
  
}