package us.or.state.pers.api.iap.rest.chklist.beans;

import java.util.List;

import us.or.state.pers.iap.api.rest.base.beans.WSBaseBean;

public class WSBChkList extends WSBaseBean{


	private Long chkListId;
	
	private List<WSBChkListMileStone> chkListMileStone;
	
	private String chkListTypCd;
	
	private String StatCd;

	public String getChkListTypCd() {
		return chkListTypCd;
	}

	public void setChkListTypCd(String chkListTypCd) {
		this.chkListTypCd = chkListTypCd;
	}

	public String getStatCd() {
		return StatCd;
	}

	public void setStatCd(String statCd) {
		StatCd = statCd;
	}

	public Long getChkListId() {
		return chkListId;
	}

	public void setChkListId(Long chkListId) {
		this.chkListId = chkListId;
	}

	/**
	 * @return the chkListMileStone
	 */
	public List<WSBChkListMileStone> getChkListMileStone() {
		return chkListMileStone;
	}

	/**
	 * @param chkListMileStone the chkListMileStone to set
	 */
	public void setChkListMileStone(List<WSBChkListMileStone> chkListMileStone) {
		this.chkListMileStone = chkListMileStone;
	}

}
