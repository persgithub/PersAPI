package us.or.state.pers.iap.api.rest.base.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WSBStatus {

	private String code;
	private String message;
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
