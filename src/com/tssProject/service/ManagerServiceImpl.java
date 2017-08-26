package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.Manager;
import com.tssProject.dao.ManagerDAO;
import com.tssProject.dao.User;

public class ManagerServiceImpl implements ManagerService {
   private ManagerDAO managerDao;

/* (non-Javadoc)
 * @see com.tssProject.service.ManagerService#getManagerDao()
 */
public ManagerDAO getManagerDao() {
	return managerDao;
}

/* (non-Javadoc)
 * @see com.tssProject.service.ManagerService#setManagerDao(com.tssProject.dao.ManagerDAO)
 */
public void setManagerDao(ManagerDAO managerDao) {
	this.managerDao = managerDao;
}

   /* (non-Javadoc)
 * @see com.tssProject.service.ManagerService#addManager(com.tssProject.dao.Manager)
 */
public boolean addManager(Manager manager){
	   String managerName=manager.getManagerName();
	   
	   List <Manager> managerList=managerDao.findByManagerName(managerName);
	   if(managerList.isEmpty()){
		   managerDao.save(manager);
		   return true;
	   }else{
		   return false;
	   }
   }


public boolean findManager(String managerName,Integer password){
	List<Manager> managerList=managerDao.findByManagerName(managerName);
	if(managerList.isEmpty()){
		return false;
	}else{
		if(managerList.get(0).getPassword().equals(password)){
			return true;
		}else{
			return false;
		}
	}
}




}
