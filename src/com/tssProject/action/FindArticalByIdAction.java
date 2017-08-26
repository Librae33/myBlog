package com.tssProject.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Topic;
import com.tssProject.service.TopicService;

public class FindArticalByIdAction extends ActionSupport {
  private TopicService topicService;
 
private int articleId;
  private Topic topic;
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

public Topic getTopic() {
	return topic;
}
public void setTopic(Topic topic) {
	this.topic = topic;
}
  
public String execute() throws Exception{
	topic=topicService.findArticalById(articleId);
	return "success";
}
}
