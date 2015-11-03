package us.or.state.pers.api.rest.common.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WSStatus {

	private String message;
	private String code;

	public String getCode() {
		return code;
	}
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
