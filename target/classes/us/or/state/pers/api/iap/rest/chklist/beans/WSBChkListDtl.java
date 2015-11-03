package us.or.state.pers.api.iap.rest.chklist.beans;

import java.util.Date;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;

public class WSBChkListDtl extends WSBaseBean{

	
	
	private Long chkListDtlId;
	
	private Long listItemRefId;

	private String listItemDsc;
	
	private Date reqDate;
	private Date compDate;
	private boolean rqrdInd;
	private boolean usrUpdtInd;
	private int seqId;
	
	public Long getListItemRefId() {
		return listItemRefId;
	}

	public void setListItemRefId(Long listItemRefId) {
		this.listItemRefId = listItemRefId;
	}


	public String getListItemDsc() {
		return listItemDsc;
	}

	public void setListItemDsc(String listItemDsc) {
		this.listItemDsc = listItemDsc;
	}

	public Long getChkListDtlId() {
		return chkListDtlId;
	}

	public void setChkListDtlId(Long chkListDtlId) {
		this.chkListDtlId = chkListDtlId;
	}

	/**
	 * @return the reqDate
	 */
	public Date getReqDate() {
		return reqDate;
	}

	/**
	 * @param reqDate the reqDate to set
	 */
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	/**
	 * @return the compDate
	 */
	public Date getCompDate() {
		return compDate;
	}

	/**
	 * @param compDate the compDate to set
	 */
	public void setCompDate(Date compDate) {
		this.compDate = compDate;
	}

	/**
	 * @return the rqrdInd
	 */
	public boolean isRqrdInd() {
		return rqrdInd;
	}

	/**
	 * @param rqrdInd the rqrdInd to set
	 */
	public void setRqrdInd(boolean rqrdInd) {
		this.rqrdInd = rqrdInd;
	}

	/**
	 * @return the usrUpdtInd
	 */
	public boolean isUsrUpdtInd() {
		return usrUpdtInd;
	}

	/**
	 * @param usrUpdtInd the usrUpdtInd to set
	 */
	public void setUsrUpdtInd(boolean usrUpdtInd) {
		this.usrUpdtInd = usrUpdtInd;
	}

	/**
	 * @return the seqId
	 */
	public int getSeqId() {
		return seqId;
	}

	/**
	 * @param seqId the seqId to set
	 */
	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}

}
