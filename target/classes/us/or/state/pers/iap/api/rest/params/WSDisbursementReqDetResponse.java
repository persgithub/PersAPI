package us.or.state.pers.iap.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.api.rest.common.beans.WSBaseResponse;
import us.or.state.pers.iap.api.rest.base.beans.WSBStatus;
import us.or.state.pers.iap.api.rest.disb.beans.WSBDisbursementReq;

@XmlRootElement
public class WSDisbursementReqDetResponse  extends WSBaseResponse {

	private WSBDisbursementReq disbReqDetails;


	/**
	 * @return the disbReqDetails
	 */
	public WSBDisbursementReq getDisbReqDetails() {
		return disbReqDetails;
	}

	/**
	 * @param disbReqDetails the disbReqDetails to set
	 */
	public void setDisbReqDetails(WSBDisbursementReq disbReqDetails) {
		this.disbReqDetails = disbReqDetails;
	}

	

}
