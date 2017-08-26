package com.tssProject.service;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.tssProject.dao.Topic;
import com.tssProject.dao.TopicDAO;

public class TopicServiceImpl implements TopicService {
   private TopicDAO  topicDao;

/* (non-Javadoc)
 * @see com.tssProject.service.TopicService#getTopicDao()
 */

   
public TopicDAO getTopicDao() {
	return topicDao;
}

public void setTopicDao(TopicDAO topicDao) {
	this.topicDao = topicDao;
}

/* (non-Javadoc)
 * @see com.tssProject.service.TopicService#addTopic(com.tssProject.dao.Topic)
 */
public boolean addTopic(Topic topic){
	//List<Topic> topicList=topicDao.findById(topic.getArticleId());
	List<Topic> topicList=topicDao.findByTiltle(topic.getTiltle());
	if(topicList.isEmpty()){
		topicDao.save(topic);
		return true;
	}else{
		return false;
	}	
}

public List<Topic> findTopic(){
	return topicDao.findAll();
	
}

public Topic findArticalById(int articleId){
	return topicDao.findById(articleId);
}
public void updateArtical(Topic topic){
	topicDao.attachDirty(topic);
	
}
public void deleteArtical(int articleId){
	Topic topic=topicDao.findById(articleId);
	topicDao.delete(topic);
}
}
