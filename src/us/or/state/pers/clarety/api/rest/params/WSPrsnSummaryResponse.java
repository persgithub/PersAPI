package us.or.state.pers.clarety.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.api.rest.common.beans.WSBaseResponse;
import us.or.state.pers.clarety.api.rest.person.beans.WSBPersonDetails;

@XmlRootElement
public class WSPrsnSummaryResponse extends WSBaseResponse{

	private WSBPersonDetails personDetails;

	/**
	 * @return the personDetails
	 */
	public WSBPersonDetails getPersonDetails() {
		return personDetails;
	}
	/**
	 * @param personDetails the personDetails to set
	 */
	public void setPersonDetails(WSBPersonDetails personDetails) {
		this.personDetails = personDetails;
	}
	
}
