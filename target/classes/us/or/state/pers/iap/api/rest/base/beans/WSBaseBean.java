package us.or.state.pers.iap.api.rest.base.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WSBaseBean {


	private Date createdDateTime;
	private String createdBy;
	private int optLockVer;
	/**
	 * @return the createdDateTime
	 */
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	/**
	 * @param createdDateTime the createdDateTime to set
	 */
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the optLockVer
	 */
	public int getOptLockVer() {
		return optLockVer;
	}
	/**
	 * @param optLockVer the optLockVer to set
	 */
	public void setOptLockVer(int optLockVer) {
		this.optLockVer = optLockVer;
	}
}
