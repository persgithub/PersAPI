package us.or.state.pers.iap.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.iap.api.rest.person.beans.WSBPerson;

@XmlRootElement
public class WSPersonSaveRequest {

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

}
