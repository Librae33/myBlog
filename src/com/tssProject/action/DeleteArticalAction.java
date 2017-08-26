package com.tssProject.action;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Topic;
import com.tssProject.service.TopicService;

public class DeleteArticalAction extends ActionSupport {
	  private TopicService topicService;
	  private int articleId;
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
	
	public String execute() throws Exception{
		topicService.deleteArtical(articleId);
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "文章删除成功！");
		return"success";
	}
}
