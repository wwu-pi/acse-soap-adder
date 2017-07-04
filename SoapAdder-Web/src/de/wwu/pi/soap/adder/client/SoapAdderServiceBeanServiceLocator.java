/**
 * SoapAdderServiceBeanServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.wwu.pi.soap.adder.client;

public class SoapAdderServiceBeanServiceLocator extends org.apache.axis.client.Service implements de.wwu.pi.soap.adder.client.SoapAdderServiceBeanService {
	private static final long serialVersionUID = 1L;

	public SoapAdderServiceBeanServiceLocator() {
    }


    public SoapAdderServiceBeanServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapAdderServiceBeanServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SoapAdderServiceBeanPort
    private java.lang.String SoapAdderServiceBeanPort_address = "http://localhost:8080/SoapService/SoapAdderServiceBean";

    public java.lang.String getSoapAdderServiceBeanPortAddress() {
        return SoapAdderServiceBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SoapAdderServiceBeanPortWSDDServiceName = "SoapAdderServiceBeanPort";

    public java.lang.String getSoapAdderServiceBeanPortWSDDServiceName() {
        return SoapAdderServiceBeanPortWSDDServiceName;
    }

    public void setSoapAdderServiceBeanPortWSDDServiceName(java.lang.String name) {
        SoapAdderServiceBeanPortWSDDServiceName = name;
    }

    public de.wwu.pi.soap.adder.client.SoapAdderServiceBean getSoapAdderServiceBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SoapAdderServiceBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSoapAdderServiceBeanPort(endpoint);
    }

    public de.wwu.pi.soap.adder.client.SoapAdderServiceBean getSoapAdderServiceBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceSoapBindingStub _stub = new de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSoapAdderServiceBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSoapAdderServiceBeanPortEndpointAddress(java.lang.String address) {
        SoapAdderServiceBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.wwu.pi.soap.adder.client.SoapAdderServiceBean.class.isAssignableFrom(serviceEndpointInterface)) {
                de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceSoapBindingStub _stub = new de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceSoapBindingStub(new java.net.URL(SoapAdderServiceBeanPort_address), this);
                _stub.setPortName(getSoapAdderServiceBeanPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SoapAdderServiceBeanPort".equals(inputPortName)) {
            return getSoapAdderServiceBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapadder.pi.wwi.de/", "SoapAdderServiceBeanService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapadder.pi.wwi.de/", "SoapAdderServiceBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SoapAdderServiceBeanPort".equals(portName)) {
            setSoapAdderServiceBeanPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
