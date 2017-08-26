package com.tssProject.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.service.ManagerService;
import com.tssProject.service.UserService;

public class LoginAction extends ActionSupport {
   private UserService userService;
   private ManagerService managerService;
   private String userName;
   private String password;
   private String userright;
public UserService getUserService() {
	return userService;
}
public void setUserService(UserService userService) {
	this.userService = userService;
}
public ManagerService getManagerService() {
	return managerService;
}
public void setManagerService(ManagerService managerService) {
	this.managerService = managerService;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserright() {
	return userright;
}
public void setUserright(String userright) {
	this.userright = userright;
}


public String execute()throws Exception{
	
	if(userright.equalsIgnoreCase("user")&&(userService.findUser(userName, password))){
		Map session=ActionContext.getContext().getSession();
		session.put("loginName", userName);
		
		return "success";
	}else{
		Integer i=new Integer(password);
		if(userright.equalsIgnoreCase("manager")&&(managerService.findManager(userName, i))){
			
			Map session=ActionContext.getContext().getSession();
			//Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);
			//HttpSession session=Request
			//session.setAttribute("loginName", userName);
			session.put("loginName", userName);
			
			
			
			return "success";
		}else{
			
			this.addActionMessage("登录失败！");
			return "failed";
		}
	}
	
	
}
}

