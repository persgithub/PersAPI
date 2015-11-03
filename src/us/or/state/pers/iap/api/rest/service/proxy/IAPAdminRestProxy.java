package us.or.state.pers.iap.api.rest.service.proxy;

import org.springframework.web.client.RestTemplate;

import us.or.state.pers.iap.api.rest.params.WSChkListMileStoneSaveRequest;
import us.or.state.pers.iap.api.rest.params.WSChkListMileStoneSaveResponse;
import us.or.state.pers.iap.api.rest.params.WSChkListResponse;
import us.or.state.pers.iap.api.rest.params.WSDisbursementReqDetResponse;
import us.or.state.pers.iap.api.rest.params.WSDisbursementSaveRequest;
import us.or.state.pers.iap.api.rest.params.WSDisbursementSaveResponse;
import us.or.state.pers.iap.api.rest.params.WSDisbursementsResponse;
import us.or.state.pers.iap.api.rest.params.WSPersonResponse;
import us.or.state.pers.iap.builder.URLBuilder;
/**
 * This is a REST Service client for IAP Admin WebServices API. It contains equivalent methods for all the IAP WebServices API methods. 
 * @author bondugj
 * Jan 14, 2015
 */

public class IAPAdminRestProxy {

	private RestTemplate restTemplate;
	private String restURL;
	
	/**
	 * This method invokes getPerson REST API  method of IAP WebSercvice Application.
	 * 
	 * @param {@link Long} personID
	 * @return {@link WSPersonResponse}
	 */
	public WSPersonResponse getPerson(long personID){
	
		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/getPerson/"+personID);
		//WSPersonResponse response = restTemplate.postForObject(urlBuilder.buildRestURL(), personID, WSPersonResponse.class);
		WSPersonResponse response = restTemplate.getForObject(urlBuilder.buildRestURL(), WSPersonResponse.class);
//		URI uri = UriComponentsBuilder.fromUriString(urlBuilder.buildRestURL()).queryParam("personID", personID).build().toUri();
//		WSPersonResponse response = restTemplate.getForObject(uri.toString(), WSPersonResponse.class);
		
		return response;
		
	}
	
	public WSDisbursementsResponse getPersonDisbRequests(long personID){

		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/getPersonDisbReqs/"+personID);
		//WSPersonResponse response = restTemplate.postForObject(urlBuilder.buildRestURL(), personID, WSPersonResponse.class);
		WSDisbursementsResponse response = restTemplate.getForObject(urlBuilder.buildRestURL(), WSDisbursementsResponse.class);

		return response;
	}

	public WSDisbursementReqDetResponse getPersonDisbReqDetails(long disbursementReqID){

		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/getDisbReqDetails/"+disbursementReqID);
		//WSPersonResponse response = restTemplate.postForObject(urlBuilder.buildRestURL(), personID, WSPersonResponse.class);
		WSDisbursementReqDetResponse response = restTemplate.getForObject(urlBuilder.buildRestURL(), WSDisbursementReqDetResponse.class);

		return response;
	}

	
	public WSDisbursementSaveResponse saveDisbursementReq(WSDisbursementSaveRequest request){

		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/saveDisbursementReq");
		//WSPersonResponse response = restTemplate.postForObject(urlBuilder.buildRestURL(), personID, WSPersonResponse.class);
		WSDisbursementSaveResponse response = restTemplate.postForObject(urlBuilder.buildRestURL(), request, WSDisbursementSaveResponse.class);

		return response;
	}

	public WSChkListResponse getChkList(long chkListId){
		
		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/getCheckList/"+chkListId);
		WSChkListResponse response = restTemplate.getForObject(urlBuilder.buildRestURL(), WSChkListResponse.class);
		
		return response;
	}
	
	
	public WSChkListMileStoneSaveResponse updateChkListDtl(WSChkListMileStoneSaveRequest request){

		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/updateChkListDtl");
		WSChkListMileStoneSaveResponse response = restTemplate.postForObject(urlBuilder.buildRestURL(), request, WSChkListMileStoneSaveResponse.class);

		return response;
	}
	
	/**
	 * @return the restTemplate
	 */
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	/**
	 * @param restTemplate the restTemplate to set
	 */
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * @return the restURL
	 */
	public String getRestURL() {
		return restURL;
	}

	/**
	 * @param restURL the restURL to set
	 */
	public void setRestURL(String restURL) {
		this.restURL = restURL;
	}
}
