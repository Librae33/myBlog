package com.tssProject.action;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Upload;
import com.tssProject.service.UploadService;

public class DeleteImgAction extends ActionSupport {
	private UploadService uploadService;
	private int fileID;
	
	public UploadService getUploadService() {
		return uploadService;
	}
	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}
	public int getFileID() {
		return fileID;
	}
	public void setFileID(int fileID) {
		this.fileID = fileID;
	}
	public String execute() throws Exception{
		uploadService.deleteImg(fileID);
		return"success";
	}

}
