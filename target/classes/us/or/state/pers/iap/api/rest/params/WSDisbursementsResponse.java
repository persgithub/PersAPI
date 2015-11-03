package us.or.state.pers.iap.api.rest.params;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.api.rest.common.beans.WSBaseResponse;
import us.or.state.pers.iap.api.rest.disb.beans.WSBDisbursementReq;

@XmlRootElement
public class WSDisbursementsResponse  extends WSBaseResponse{

	private List<WSBDisbursementReq> disbReqList;

	/**
	 * @return the disbReqList
	 */
	public List<WSBDisbursementReq> getDisbReqList() {
		return disbReqList;
	}

	/**
	 * @param disbReqList the disbReqList to set
	 */
	public void setDisbReqList(List<WSBDisbursementReq> disbReqList) {
		this.disbReqList = disbReqList;
	}
	

}
