package us.or.state.pers.iap.api.rest.disb.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;



@XmlRootElement
public class WSBDisbursementReq extends WSBaseBean{

	private Long disbursementReqID;
	
//	private Person person;
	
	private String typeCD;
	
	private String ackStatusCD;
	
	private String pymntMethCD;
	
	private String fedTaxInstrCD;
	
	private String stTaxInstrCD;
	
	private Date rcvdDateTime;
	
	private boolean achInd;
	
	private double fedTaxExtraWtdhldg;
	
	private double stTaxExtraWtdhldg;
	
	private double adminFee;
	
	private Integer  orgRltnID;

	private WSBACHReq wsbACHReq;

	private long personID;
	
	private WSBRtrmtRqst rtrmtReq;
	
	private WSBPeriodicInstlmt periodicInstlmt;
	
	/**
	 * @return the disbursementReqID
	 */
	public Long getDisbursementReqID() {
		return disbursementReqID;
	}

	/**
	 * @param disbursementReqID the disbursementReqID to set
	 */
	public void setDisbursementReqID(Long disbursementReqID) {
		this.disbursementReqID = disbursementReqID;
	}

//	/**
//	 * @return the person
//	 */
//	public Person getPerson() {
//		return person;
//	}
//
//	/**
//	 * @param person the person to set
//	 */
//	public void setPerson(Person person) {
//		this.person = person;
//	}

	/**
	 * @return the typeCD
	 */
	public String getTypeCD() {
		return typeCD;
	}

	/**
	 * @param typeCD the typeCD to set
	 */
	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	/**
	 * @return the ackStatusCD
	 */
	public String getAckStatusCD() {
		return ackStatusCD;
	}

	/**
	 * @param ackStatusCD the ackStatusCD to set
	 */
	public void setAckStatusCD(String ackStatusCD) {
		this.ackStatusCD = ackStatusCD;
	}

	/**
	 * @return the pymntMethCD
	 */
	public String getPymntMethCD() {
		return pymntMethCD;
	}

	/**
	 * @param pymntMethCD the pymntMethCD to set
	 */
	public void setPymntMethCD(String pymntMethCD) {
		this.pymntMethCD = pymntMethCD;
	}

	/**
	 * @return the fedTaxInstrCD
	 */
	public String getFedTaxInstrCD() {
		return fedTaxInstrCD;
	}

	/**
	 * @param fedTaxInstrCD the fedTaxInstrCD to set
	 */
	public void setFedTaxInstrCD(String fedTaxInstrCD) {
		this.fedTaxInstrCD = fedTaxInstrCD;
	}

	/**
	 * @return the stTaxInstrCD
	 */
	public String getStTaxInstrCD() {
		return stTaxInstrCD;
	}

	/**
	 * @param stTaxInstrCD the stTaxInstrCD to set
	 */
	public void setStTaxInstrCD(String stTaxInstrCD) {
		this.stTaxInstrCD = stTaxInstrCD;
	}

	/**
	 * @return the rcvdDateTime
	 */
	public Date getRcvdDateTime() {
		return rcvdDateTime;
	}

	/**
	 * @param rcvdDateTime the rcvdDateTime to set
	 */
	public void setRcvdDateTime(Date rcvdDateTime) {
		this.rcvdDateTime = rcvdDateTime;
	}

	/**
	 * @return the achInd
	 */
	public boolean isAchInd() {
		return achInd;
	}

	/**
	 * @param achInd the achInd to set
	 */
	public void setAchInd(boolean achInd) {
		this.achInd = achInd;
	}

	/**
	 * @return the fedTaxExtraWtdhldg
	 */
	public double getFedTaxExtraWtdhldg() {
		return fedTaxExtraWtdhldg;
	}

	/**
	 * @param fedTaxExtraWtdhldg the fedTaxExtraWtdhldg to set
	 */
	public void setFedTaxExtraWtdhldg(double fedTaxExtraWtdhldg) {
		this.fedTaxExtraWtdhldg = fedTaxExtraWtdhldg;
	}

	/**
	 * @return the stTaxExtraWtdhldg
	 */
	public double getStTaxExtraWtdhldg() {
		return stTaxExtraWtdhldg;
	}

	/**
	 * @param stTaxExtraWtdhldg the stTaxExtraWtdhldg to set
	 */
	public void setStTaxExtraWtdhldg(double stTaxExtraWtdhldg) {
		this.stTaxExtraWtdhldg = stTaxExtraWtdhldg;
	}

	/**
	 * @return the adminFee
	 */
	public double getAdminFee() {
		return adminFee;
	}

	/**
	 * @param adminFee the adminFee to set
	 */
	public void setAdminFee(double adminFee) {
		this.adminFee = adminFee;
	}

	/**
	 * @return the orgRltnID
	 */
	public Integer getOrgRltnID() {
		return orgRltnID;
	}

	/**
	 * @param orgRltnID the orgRltnID to set
	 */
	public void setOrgRltnID(Integer orgRltnID) {
		this.orgRltnID = orgRltnID;
	}

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
	 * @return the wsbACHReq
	 */
	public WSBACHReq getWsbACHReq() {
		return wsbACHReq;
	}

	/**
	 * @param wsbACHReq the wsbACHReq to set
	 */
	public void setWsbACHReq(WSBACHReq wsbACHReq) {
		this.wsbACHReq = wsbACHReq;
	}

	public WSBRtrmtRqst getRtrmtReq() {
		return rtrmtReq;
	}

	public void setRtrmtReq(WSBRtrmtRqst rtrmtReq) {
		this.rtrmtReq = rtrmtReq;
	}

	public WSBPeriodicInstlmt getPeriodicInstlmt() {
		return periodicInstlmt;
	}

	public void setPeriodicInstlmt(WSBPeriodicInstlmt periodicInstlmt) {
		this.periodicInstlmt = periodicInstlmt;
	}

}
