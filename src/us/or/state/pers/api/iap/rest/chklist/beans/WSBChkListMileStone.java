package us.or.state.pers.api.iap.rest.chklist.beans;

import java.util.List;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;

public class WSBChkListMileStone extends WSBaseBean{


	private Long chkListMileStoneId;
	
	private Long mileStoneRefId;
	
	private String statCd;
	
	private String compDt;
	
	private String milestoneNm;

	private List<WSBChkListDtl> chkListDtlList;
	
	public Long getChkListMileStoneId() {
		return chkListMileStoneId;
	}

	public void setChkListMileStoneId(Long chkListMileStoneId) {
		this.chkListMileStoneId = chkListMileStoneId;
	}


	public String getStatCd() {
		return statCd;
	}

	public void setStatCd(String statCd) {
		this.statCd = statCd;
	}

	public String getCompDt() {
		return compDt;
	}

	public void setCompDt(String compDt) {
		this.compDt = compDt;
	}

	public String getMilestoneNm() {
		return milestoneNm;
	}

	public void setMilestoneNm(String milestoneNm) {
		this.milestoneNm = milestoneNm;
	}

	public Long getMileStoneRefId() {
		return mileStoneRefId;
	}

	public void setMileStoneRefId(Long mileStoneRefId) {
		this.mileStoneRefId = mileStoneRefId;
	}

	/**
	 * @return the chkListDtlList
	 */
	public List<WSBChkListDtl> getChkListDtlList() {
		return chkListDtlList;
	}

	/**
	 * @param chkListDtlList the chkListDtlList to set
	 */
	public void setChkListDtlList(List<WSBChkListDtl> chkListDtlList) {
		this.chkListDtlList = chkListDtlList;
	}

}
