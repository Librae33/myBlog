package com.tssProject.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.User;
import com.tssProject.service.UserService;

public class AddUserAction extends ActionSupport {
	private UserService userService;
    private String userName;
    private Integer age;
    private String password;
    private String sex;
    private Integer phone;
    private String email;
    private String introduction;
    private Date birthday;
    
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String execute()throws Exception{
		User user=new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setPassword(password);
		user.setSex(sex);
		user.setEmail(email);
		user.setPhone(phone);
		user.setIntroduction(introduction);
		user.setBirthday(birthday);
		if(userService.addUser(user)){
			this.addActionMessage("添加成功!!!");
			
		}else{
			this.addActionMessage("添加失败");
		}
		return "success";
		
		
	}
}
