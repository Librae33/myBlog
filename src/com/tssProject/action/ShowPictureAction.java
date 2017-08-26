package com.tssProject.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.service.ShowPictureService;
import com.tssProject.dao.Upload;

public class ShowPictureAction extends ActionSupport {
    private ShowPictureService showPictureService;
    List<Upload> uploadlist;
	
	public ShowPictureService getShowPictureService() {
		return showPictureService;
	}
	public void setShowPictureService(ShowPictureService showPictureService) {
		this.showPictureService = showPictureService;
	}
	public List<Upload> getUploadlist() {
		return uploadlist;
	}
	public void setUploadlist(List<Upload> uploadlist) {
		this.uploadlist = uploadlist;
	}
	public String execute()throws Exception{
		
		uploadlist=showPictureService.findPicture();

		return "success";
	}
}
