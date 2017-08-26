package com.tssProject.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Manager;
import com.tssProject.service.ManagerService;

public class ManagerAction extends ActionSupport {
  private ManagerService  managerService;
  private String managerName;
  private Integer password;
public ManagerService getManagerService() {
	return managerService;
}
public void setManagerService(ManagerService managerService) {
	this.managerService = managerService;
}
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public Integer getPassword() {
	return password;
}
public void setPassword(Integer password) {
	this.password = password;
}
public String addmanager(){
	Manager manager=new Manager();
	manager.setManagerName(managerName);
	manager.setPassword(password);
	
	if(managerService.addManager(manager)){
		this.addActionMessage("����Ա��ӳɹ�");
		
	}else{
		this.addActionMessage("����Ա���ʧ��");
	}
	return "success";
	}
}
