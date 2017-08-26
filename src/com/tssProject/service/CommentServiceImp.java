package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.Comment;
import com.tssProject.dao.CommentDAO;
import com.tssProject.dao.Topic;

public class CommentServiceImp implements CommentService {
 private CommentDAO commentdao;

/* (non-Javadoc)
 * @see com.tssProject.service.CommentService#getCommentdao()
 */
public CommentDAO getCommentdao() {
	return commentdao;
}

/* (non-Javadoc)
 * @see com.tssProject.service.CommentService#setCommentdao(com.tssProject.dao.CommentDAO)
 */
public void setCommentdao(CommentDAO commentdao) {
	this.commentdao = commentdao;
}
/* (non-Javadoc)
 * @see com.tssProject.service.CommentService#addComment(com.tssProject.dao.Comment)
 */
public boolean addComment(Comment comment){
	String content=comment.getContent();
	List<Comment> commentlist=commentdao.findByContent(content);
	if(commentlist.isEmpty()){
		commentdao.save(comment);
		return true;
	}else{
		return false;
	}
	
}

public List<Comment> findComment(int articleId){
	return commentdao.findByArticleId(articleId);
    }
public List<Comment> findComment2(){
	return commentdao.findAll();
    }
public void deleteComment(int commentid){
	Comment comment=commentdao.findById(commentid);
	commentdao.delete(comment);
	
    }

}
