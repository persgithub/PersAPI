package us.or.state.pers.iap.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.api.iap.rest.chklist.beans.WSBChkList;

@XmlRootElement
public class WSChkListRequest {

	private WSBChkList chkList;

	public WSBChkList getChkList() {
		return chkList;
	}

	public void setChkList(WSBChkList chkList) {
		this.chkList = chkList;
	}
}
