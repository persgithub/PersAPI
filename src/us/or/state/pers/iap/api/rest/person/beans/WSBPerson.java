package us.or.state.pers.iap.api.rest.person.beans;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;

public class WSBPerson extends WSBaseBean {

	private long personID;
	
	private long jcPrsnID;

	
	/**
	 * @return the personID
	 */
	public long getPersonID() {
		return personID;
	}

	/**
	 * @param personID the personID to set
	 */
	public void setPersonID(long personID) {
		this.personID = personID;
	}

	/**
	 * @return the jcPrsnID
	 */
	public long getJcPrsnID() {
		return jcPrsnID;
	}

	/**
	 * @param jcPrsnID the jcPrsnID to set
	 */
	public void setJcPrsnID(long jcPrsnID) {
		this.jcPrsnID = jcPrsnID;
	}

}
