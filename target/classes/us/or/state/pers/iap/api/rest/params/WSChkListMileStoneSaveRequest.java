package us.or.state.pers.iap.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.api.iap.rest.chklist.beans.WSBChkListMileStone;

@XmlRootElement
public class WSChkListMileStoneSaveRequest {

	private WSBChkListMileStone chkListMileStone;

	public WSBChkListMileStone getChkListMileStone() {
		return chkListMileStone;
	}

	public void setChkListMileStone(WSBChkListMileStone chkListMileStone) {
		this.chkListMileStone = chkListMileStone;
	}
}
