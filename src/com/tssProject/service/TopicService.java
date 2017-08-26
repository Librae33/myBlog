package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.Topic;
import com.tssProject.dao.TopicDAO;

public interface TopicService {

	public abstract TopicDAO getTopicDao();

	public abstract void setTopicDao(TopicDAO topicDao);

	public abstract boolean addTopic(Topic topic);
	public List<Topic> findTopic();
	public Topic findArticalById(int articleId);
	public void updateArtical(Topic topic);
	public void deleteArtical(int articleId);

}