package com.tssProject.action;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Topic;
import com.tssProject.service.TopicService;

public class TopicAction extends ActionSupport {
private TopicService topicService;
private int articleId;
private String userName;
private String tiltle;
private String tcontent;
private Date createtime;


public Date getCreatetime() {
	return createtime;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}
public int getArticleId() {
	return articleId;
}
public void setArticleId(int articleId) {
	this.articleId = articleId;
}
public TopicService getTopicService() {
	return topicService;
}
public void setTopicService(TopicService topicService) {
	this.topicService = topicService;
}

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getTiltle() {
	return tiltle;
}
public void setTiltle(String tiltle) {
	this.tiltle = tiltle;
}
public String getTcontent() {
	return tcontent;
}
public void setTcontent(String tcontent) {
	this.tcontent = tcontent;
}


public String addTopic(){
	Topic topic=new Topic();
	topic.setUserName(userName);
	topic.setTiltle(tiltle);
	topic.setTcontent(tcontent);
	topic.setCreatetime(new Date());
	if(topicService.addTopic(topic)){
	
		this.addActionMessage("添加成功！");
		
	}else{
		
		this.addActionMessage("添加失败！");
		
	}
	return "success";
}
}
