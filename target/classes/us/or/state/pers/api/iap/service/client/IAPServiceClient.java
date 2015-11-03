package us.or.state.pers.api.iap.service.client;

import org.springframework.web.client.RestTemplate;

import us.or.state.pers.api.base.service.client.ServiceClient;
/**
 * Abstract base client for all IAP Service clients. 
 * @author bondugj
 *
 */
public abstract class IAPServiceClient implements ServiceClient{

	private RestTemplate restTemplate;
	private String restURL;

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
