package com.tssProject.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Comment;
import com.tssProject.dao.Topic;
import com.tssProject.service.CommentService;
import com.tssProject.service.TopicService;

public class CommanageAction extends ActionSupport {
	private CommentService commentservice;
	private TopicService topicService;
	private String content;
	private int articleId;
	private Topic topic;
	List<Comment> commentlist;
	List<Comment> commentlist2;
	
	
	public List<Comment> getCommentlist2() {
		return commentlist2;
	}
	public void setCommentlist2(List<Comment> commentlist2) {
		this.commentlist2 = commentlist2;
	}
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
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
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
	public List<Comment> getCommentlist() {
		return commentlist;
	}
	public void setCommentlist(List<Comment> commentlist) {
		this.commentlist = commentlist;
	}
	
	
	public String execute() throws Exception{
		commentlist2=commentservice.findComment2();
		commentlist=commentservice.findComment(articleId);
	    return "success";
	}
	
	
}
