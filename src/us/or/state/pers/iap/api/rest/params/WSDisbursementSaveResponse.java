package us.or.state.pers.iap.api.rest.params;

import javax.xml.bind.annotation.XmlRootElement;

import us.or.state.pers.api.rest.common.beans.WSBaseResponse;
import us.or.state.pers.iap.api.rest.disb.beans.WSBDisbursementReq;

@XmlRootElement

public class WSDisbursementSaveResponse extends WSBaseResponse{

	private WSBDisbursementReq disbursementReq;
	
	public WSBDisbursementReq getDisbursementReq() {
		return disbursementReq;
	}

	public void setDisbursementReq(WSBDisbursementReq disbursementReq) {
		this.disbursementReq = disbursementReq;
	}
	
}
