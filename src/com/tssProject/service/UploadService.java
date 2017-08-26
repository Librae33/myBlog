package com.tssProject.service;

import com.tssProject.dao.Upload;
import com.tssProject.dao.UploadDAO;

public interface UploadService {

	public abstract UploadDAO getUploadDao();

	public abstract void setUploadDao(UploadDAO uploadDao);

	public abstract void addFile(Upload uploadImg);
	public void deleteImg(int fileID);

}