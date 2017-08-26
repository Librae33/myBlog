package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.User;
import com.tssProject.dao.UserDAO;

public class UserServiceImpl implements UserService {
 private UserDAO userdao;

/* (non-Javadoc)
 * @see com.tssProject.service.UserService#getUserdao()
 */
public UserDAO getUserdao() {
	return userdao;
}

/* (non-Javadoc)
 * @see com.tssProject.service.UserService#setUserdao(com.tssProject.dao.UserDAO)
 */
public void setUserdao(UserDAO userdao) {
	this.userdao = userdao;
}
 
/* (non-Javadoc)
 * @see com.tssProject.service.UserService#addUser(com.tssProject.dao.User)
 */
public boolean addUser(User user){
	String userName=user.getUserName();
	List<User> userList=userdao.findByUserName(userName);

	if(userList.isEmpty()){
		userdao.save(user);
		return true;
	}else{
		return false;
	}
}

public boolean findUser(String userName,String password){
	List<User> userList=userdao.findByUserName(userName);
	if(userList.isEmpty()){
		return false;
	}else{
		if(userList.get(0).getPassword().equalsIgnoreCase(password)){
			return true;
		}else{
			return false;
		}
	}
}



}
