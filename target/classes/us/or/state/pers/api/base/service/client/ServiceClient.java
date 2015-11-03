package us.or.state.pers.api.base.service.client;

import java.util.Map;
/**
 * ServiceClient Interface for all the Client classes
 * @author bondugj
 * Jan 14, 2015
 */

public interface ServiceClient {

	public <T> T  invokeAPI(Map<String, Object> requestMap); 
}
