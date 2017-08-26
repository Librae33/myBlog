package com.tssProject.service;

import com.tssProject.dao.Manager;
import com.tssProject.dao.ManagerDAO;

public interface ManagerService {

	public abstract ManagerDAO getManagerDao();

	public abstract void setManagerDao(ManagerDAO managerDao);

	public abstract boolean addManager(Manager manager);
	
	public boolean findManager(String managerName,Integer password);

}