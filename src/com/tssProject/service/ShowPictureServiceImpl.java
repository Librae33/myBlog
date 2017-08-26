package com.tssProject.service;

import java.util.List;


import com.tssProject.dao.Upload;
import com.tssProject.dao.UploadDAO;

  public class ShowPictureServiceImpl implements ShowPictureService {
	private UploadDAO uploadDao;

	/* (non-Javadoc)
	 * @see com.tssProject.service.ShowPictureService#getUploadDao()
	 */
	public UploadDAO getUploadDao() {
		return uploadDao;
	}

	/* (non-Javadoc)
	 * @see com.tssProject.service.ShowPictureService#setUploadDao(com.tssProject.dao.UploadDAO)
	 */
	public void setUploadDao(UploadDAO uploadDao) {
		this.uploadDao = uploadDao;
	}
	/* (non-Javadoc)
	 * @see com.tssProject.service.ShowPictureService#findPicture()
	 */
	public List<Upload> findPicture(){
		return uploadDao.findAll();
	    }


}
