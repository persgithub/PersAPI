package us.or.state.pers.clarety.api.rest.service.proxy;

import org.springframework.web.client.RestTemplate;

import us.or.state.pers.clarety.api.rest.params.WSPrsnSummaryResponse;
import us.or.state.pers.iap.builder.URLBuilder;

/**
 * This is a REST Service client for JClarety Admin WebServices API. It contains equivalent methods for all the JClarety WebServices API methods.
 * @author bondugj
 * Jan 14, 2015
 */

public class ClaretyRestProxy {

	private RestTemplate restTemplate;
	private String restURL;
	
	/**
	 * This method invokes getPerson REST API  method of JClarety WebSercvice Application.
	 * 
	 * @param {@link String} personID
	 * @return {@link WSPrsnSummaryResponse}
	 */
	public WSPrsnSummaryResponse getPerson(String parameter){
	
		URLBuilder urlBuilder = new URLBuilder(new StringBuilder(), getRestURL(), "/getPerson/"+parameter);
		WSPrsnSummaryResponse response = restTemplate.getForObject(urlBuilder.buildRestURL(), WSPrsnSummaryResponse.class);
		
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
