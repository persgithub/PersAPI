package us.or.state.pers.api.rest.common.beans;


public class WSBaseResponse {

	private WSStatus status;

	/**
	 * @return the status
	 */
	public WSStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(WSStatus status) {
		this.status = status;
	}
	
}
