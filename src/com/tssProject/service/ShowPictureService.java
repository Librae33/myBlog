package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.Upload;
import com.tssProject.dao.UploadDAO;

public interface ShowPictureService {

	public abstract UploadDAO getUploadDao();

	public abstract void setUploadDao(UploadDAO uploadDao);

	public abstract List<Upload> findPicture();

}