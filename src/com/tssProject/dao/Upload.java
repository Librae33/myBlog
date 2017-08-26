package com.tssProject.dao;

/**
 * Upload entity. @author MyEclipse Persistence Tools
 */

public class Upload implements java.io.Serializable {

	// Fields

	private Integer fileId;
	private String location;

	// Constructors

	/** default constructor */
	public Upload() {
	}

	/** full constructor */
	public Upload(String location) {
		this.location = location;
	}

	// Property accessors

	public Integer getFileId() {
		return this.fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}