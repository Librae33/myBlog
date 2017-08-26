package com.tssProject.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Comment;
import com.tssProject.dao.Topic;
import com.tssProject.service.CommentService;
import com.tssProject.service.TopicService;

public class CommentAction extends ActionSupport {
	private CommentService commentservice;
	private String content;
	private TopicService topicService;
	private int articleId;
	private Topic topic;
	private String tiltle;
	private Date comtime;
	
	
	public Date getComtime() {
		return comtime;
	}
	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}
	public String getTiltle() {
		return tiltle;
	}
	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}
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
	public TopicService getTopicService() {
		return topicService;
	}
	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}
	
	public CommentService getCommentservice() {
		return commentservice;
	}
	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String execute()throws Exception{
		Comment comment=new Comment();
		comment.setArticleId(articleId);
		comment.setContent(content);
		comment.setTiltle(tiltle);
		comment.setComtime(new Date());
		commentservice.addComment(comment);
		return "success";
	}
}
