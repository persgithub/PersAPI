package us.or.state.pers.iap.api.rest.disb.beans;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;



public class WSBPeriodicInstlmt extends WSBaseBean {

	
	private long disbursementReqID;
	
	private String durtnCd;
	
	private String pymtFreq;


	/**
	 * @return the disbursementReqID
	 */
	public long getDisbursementReqID() {
		return disbursementReqID;
	}

	/**
	 * @param set the disbursementReqID
	 */
	public void setDisbursementReqID(long disbursementReqID) {
		this.disbursementReqID = disbursementReqID;
	}


	/**
	 * @return the durtnCd
	 */
	public String getDurtnCd() {
		return durtnCd;
	}
	
	/**
	 * @param set the durtnCd
	 */
	public void setDurtnCd(String durtnCd) {
		this.durtnCd = durtnCd;
	}
	
	/**
	 * @return the pymtFreq
	 */
	public String getPymtFreq() {
		return pymtFreq;
	}
	
	/**
	 * @param set the pymtFreq
	 */
	public void setPymtFreq(String pymtFreq) {
		this.pymtFreq = pymtFreq;
	}

}


