package com.tssProject.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Topic;
import com.tssProject.service.TopicService;

public class ArticalManageAction extends ActionSupport {
	private TopicService topicService;
	private String userName;
	private String tiltle;
	private List <Topic> topicList;
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
	public List<Topic> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	
	public String execute() throws Exception{
		topicList=topicService.findTopic();
	    return "success";
}
}
