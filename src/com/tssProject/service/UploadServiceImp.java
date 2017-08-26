package com.tssProject.service;

import com.tssProject.dao.Upload;
import com.tssProject.dao.UploadDAO;

public class UploadServiceImp implements UploadService {
	private UploadDAO uploadDao;

	/* (non-Javadoc)
	 * @see com.tssProject.service.UploadService#getUploadDao()
	 */
	public UploadDAO getUploadDao() {
		return uploadDao;
	}

	/* (non-Javadoc)
	 * @see com.tssProject.service.UploadService#setUploadDao(com.tssProject.dao.UploadDAO)
	 */
	public void setUploadDao(UploadDAO uploadDao) {
		this.uploadDao = uploadDao;
	}
	/* (non-Javadoc)
	 * @see com.tssProject.service.UploadService#addFile(com.tssProject.dao.Upload)
	 */
	public void addFile(Upload uploadImg){
		uploadDao.save(uploadImg);
		
	}
	
	public void deleteImg(int fileID){
		Upload uploadimg=uploadDao.findById(fileID);
		uploadDao.delete(uploadimg);
	}


}
