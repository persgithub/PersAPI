package us.or.state.pers.iap.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.iap.api.rest.base.beans.WSBStatus;
import us.or.state.pers.iap.api.rest.person.beans.WSBPerson;

@XmlRootElement
public class WSPersonSaveResponse {

	private WSBStatus status;
	private WSBPerson person;
	
	/**
	 * @return the person
	 */
	public WSBPerson getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(WSBPerson person) {
		this.person = person;
	}

	/**
	 * @return the status
	 */
	public WSBStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(WSBStatus status) {
		this.status = status;
	}


}
