package us.or.state.pers.iap.api.rest.disb.beans;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;


@XmlRootElement
public class WSBACHReq extends WSBaseBean{

	private long disbursementReqID;
	
	private String accTypeCD;
	
	private String routeNum;

	private String brNum;

	private String brTel;

	private boolean jointAcctInd;

	private boolean sgndJointReqInd;

	private String jointFirstName;

	private String jointMiddleName;
	
	private String jointLastName;

	private String finInst;

	private String brName;

	private String acctNum;

	/**
	 * @return the disbursementReqID
	 */
	public long getDisbursementReqID() {
		return disbursementReqID;
	}

	/**
	 * @param disbursementReqID the disbursementReqID to set
	 */
	public void setDisbursementReqID(long disbursementReqID) {
		this.disbursementReqID = disbursementReqID;
	}

	/**
	 * @return the accTypeCD
	 */
	public String getAccTypeCD() {
		return accTypeCD;
	}

	/**
	 * @param accTypeCD the accTypeCD to set
	 */
	public void setAccTypeCD(String accTypeCD) {
		this.accTypeCD = accTypeCD;
	}

	/**
	 * @return the routeNum
	 */
	public String getRouteNum() {
		return routeNum;
	}

	/**
	 * @param routeNum the routeNum to set
	 */
	public void setRouteNum(String routeNum) {
		this.routeNum = routeNum;
	}

	/**
	 * @return the brNum
	 */
	public String getBrNum() {
		return brNum;
	}

	/**
	 * @param brNum the brNum to set
	 */
	public void setBrNum(String brNum) {
		this.brNum = brNum;
	}

	/**
	 * @return the brTel
	 */
	public String getBrTel() {
		return brTel;
	}

	/**
	 * @param brTel the brTel to set
	 */
	public void setBrTel(String brTel) {
		this.brTel = brTel;
	}

	/**
	 * @return the jointAcctInd
	 */
	public boolean isJointAcctInd() {
		return jointAcctInd;
	}

	/**
	 * @param jointAcctInd the jointAcctInd to set
	 */
	public void setJointAcctInd(boolean jointAcctInd) {
		this.jointAcctInd = jointAcctInd;
	}

	/**
	 * @return the sgndJointReqInd
	 */
	public boolean isSgndJointReqInd() {
		return sgndJointReqInd;
	}

	/**
	 * @param sgndJointReqInd the sgndJointReqInd to set
	 */
	public void setSgndJointReqInd(boolean sgndJointReqInd) {
		this.sgndJointReqInd = sgndJointReqInd;
	}

	/**
	 * @return the jointFirstName
	 */
	public String getJointFirstName() {
		return jointFirstName;
	}

	/**
	 * @param jointFirstName the jointFirstName to set
	 */
	public void setJointFirstName(String jointFirstName) {
		this.jointFirstName = jointFirstName;
	}

	/**
	 * @return the jointMiddleName
	 */
	public String getJointMiddleName() {
		return jointMiddleName;
	}

	/**
	 * @param jointMiddleName the jointMiddleName to set
	 */
	public void setJointMiddleName(String jointMiddleName) {
		this.jointMiddleName = jointMiddleName;
	}

	/**
	 * @return the jointLastName
	 */
	public String getJointLastName() {
		return jointLastName;
	}

	/**
	 * @param jointLastName the jointLastName to set
	 */
	public void setJointLastName(String jointLastName) {
		this.jointLastName = jointLastName;
	}

	/**
	 * @return the finInst
	 */
	public String getFinInst() {
		return finInst;
	}

	/**
	 * @param finInst the finInst to set
	 */
	public void setFinInst(String finInst) {
		this.finInst = finInst;
	}

	/**
	 * @return the brName
	 */
	public String getBrName() {
		return brName;
	}

	/**
	 * @param brName the brName to set
	 */
	public void setBrName(String brName) {
		this.brName = brName;
	}

	/**
	 * @return the acctNum
	 */
	public String getAcctNum() {
		return acctNum;
	}

	/**
	 * @param acctNum the acctNum to set
	 */
	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}


}
