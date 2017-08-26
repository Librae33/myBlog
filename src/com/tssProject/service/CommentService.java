package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.Comment;
import com.tssProject.dao.CommentDAO;

public interface CommentService {

	public abstract CommentDAO getCommentdao();

	public abstract void setCommentdao(CommentDAO commentdao);

	public abstract boolean addComment(Comment comment);
	
	public List<Comment> findComment(int articleId);
	public List<Comment> findComment2();
	public void deleteComment(int commentid);

}