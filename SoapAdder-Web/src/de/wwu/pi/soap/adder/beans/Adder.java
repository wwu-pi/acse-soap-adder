package de.wwu.pi.soap.adder.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import de.wwu.pi.soap.adder.client.SoapAdderServiceBean;
import de.wwu.pi.soap.adder.client.SoapAdderServiceBeanService;
import de.wwu.pi.soap.adder.client.SoapAdderServiceBeanServiceLocator;

@ManagedBean
@RequestScoped
public class Adder {

	int x, y, result;

	public Adder() {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void send() {
		SoapAdderServiceBeanService service = new SoapAdderServiceBeanServiceLocator();   
		try {
			SoapAdderServiceBean port = service.getSoapAdderServiceBeanPort();
			this.setResult(port.addTwoNumber(x, y));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
