package com.tssProject.dao;

/**
 * Contact entity. @author MyEclipse Persistence Tools
 */

public class Contact implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String cname;
	private Long cphone;
	private String cemail;
	private String cmessage;

	// Constructors

	/** default constructor */
	public Contact() {
	}

	/** full constructor */
	public Contact(String cname, Long cphone, String cemail, String cmessage) {
		this.cname = cname;
		this.cphone = cphone;
		this.cemail = cemail;
		this.cmessage = cmessage;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getCphone() {
		return this.cphone;
	}

	public void setCphone(Long cphone) {
		this.cphone = cphone;
	}

	public String getCemail() {
		return this.cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCmessage() {
		return this.cmessage;
	}

	public void setCmessage(String cmessage) {
		this.cmessage = cmessage;
	}

}