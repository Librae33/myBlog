package com.tssProject.service;

import com.tssProject.dao.User;
import com.tssProject.dao.UserDAO;

public interface UserService {

	public abstract UserDAO getUserdao();

	public abstract void setUserdao(UserDAO userdao);

	public abstract boolean addUser(User user);
	
	public boolean findUser(String userName,String password);

}