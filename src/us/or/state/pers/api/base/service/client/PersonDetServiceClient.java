package us.or.state.pers.api.base.service.client;

import java.util.Map;

import us.or.state.pers.api.iap.service.client.IAPServiceClient;
import us.or.state.pers.api.iap.service.client.IAPServiceConstants;
import us.or.state.pers.iap.api.rest.params.WSPersonResponse;
import us.or.state.pers.iap.builder.URLBuilder;

public class PersonDetServiceClient extends IAPServiceClient{

	@Override
	public <T>T  invokeAPI(Map<String, Object> requestMap) {
		
		String personID = (String) requestMap.get(IAPServiceConstants.PARAM);
		
		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/getPerson");
		WSPersonResponse response = getRestTemplate().postForObject(urlBuilder.buildRestURL(), personID, WSPersonResponse.class);
		
		
		return ((T) response);
		
		
	}
	

	
}
