package com.tssProject.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Comment;
import com.tssProject.dao.Topic;
import com.tssProject.service.CommentService;
import com.tssProject.service.TopicService;
import com.tssProject.service.UserService;

public class ArticalAction extends ActionSupport {
	private int articleId;
	private Topic topic;
	
	private UserService userService;
	private TopicService topicService;
	private CommentService commentservice;
	private String userName;
	private String tiltle;
	private List <Topic> topicList;
	List<Comment> commentlist;
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public List<Comment> getCommentlist() {
		return commentlist;
	}
	public void setCommentlist(List<Comment> commentlist) {
		this.commentlist = commentlist;
	}
	
	public CommentService getCommentservice() {
		return commentservice;
	}
	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
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
	public List<Topic> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	public String execute() throws Exception{
		topicList=topicService.findTopic();
		topic=topicService.findArticalById(articleId);
		commentlist=commentservice.findComment(articleId);
		
	    return "success";
}
}
