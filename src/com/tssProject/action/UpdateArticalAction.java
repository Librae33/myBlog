package com.tssProject.action;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Topic;
import com.tssProject.service.TopicService;

public class UpdateArticalAction extends ActionSupport {
	private TopicService topicService;
	private int articleId;
	
	private String userName;
	private String tiltle;
	private String tcontent;
	public TopicService getTopicService() {
		return topicService;
	}
	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
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
	public String execute() throws Exception{
		
		Topic topic=new Topic();
		topic.setArticleId(articleId);
		topic.setUserName(userName);
		topic.setTiltle(tiltle);
		topic.setTcontent(tcontent);
		topic.setCreatetime(new Date());
		topicService.updateArtical(topic);
		this.addActionMessage("修改成功！");
		return "success";
	}
	
}
