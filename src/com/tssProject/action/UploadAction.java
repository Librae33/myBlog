package com.tssProject.action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Upload;
import com.tssProject.service.UploadService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.hibernate.mapping.Map;
public class UploadAction extends ActionSupport {
	private UploadService uploadService;
	private File upload;
	private String uploadFileName;
	private String savePath;
	private String location;
	public UploadService getUploadService() {
		return uploadService;
	}
	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		Date date = new Date();
		return  date.getTime() + uploadFileName.substring(uploadFileName.lastIndexOf("."));
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
		
	}
	public String getSavePath() {
		return  ServletActionContext.getRequest().getRealPath("/upload");
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String execute()throws Exception{
		String fileName=getUploadFileName();
		FileOutputStream fos = new FileOutputStream(getSavePath() + "/" + fileName);
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = fis.read(buffer)) > 0){
			fos.write(buffer,0,len);
		}
		fis.close();
		fos.close();
		Upload uploadImg= new Upload();
		uploadImg.setLocation("upload/" + fileName);
		uploadService.addFile(uploadImg);
		return "success";
	}
	
	

	

}
