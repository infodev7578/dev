package fr.eugena.webservice.rest.io;

public class ResponseStatut {

	private String type;
	private String detail;

	public ResponseStatut() {
		super();
	}

	public ResponseStatut(String type, String detail) {
		super();
		this.type = type;
		this.detail = detail;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @param detail
	 *            the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

}
