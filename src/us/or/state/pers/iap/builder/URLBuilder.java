package us.or.state.pers.iap.builder;

public class URLBuilder {

	private StringBuilder restURL = null;
	private String url = null;
	private String apiMethod = null;
	
	public URLBuilder(StringBuilder restURL, String url, String apiMethod){

		this.restURL = restURL;
		this.url = url;
		this.apiMethod = apiMethod;
	}
	
	public String buildRestURL(){

		
		restURL.append(url);
		restURL.append(apiMethod);
		
		return restURL.toString();
	}
	
	
}
