package com.tssProject.action;

import com.tssProject.dao.Comment;
import com.tssProject.service.CommentService;

public class FindCommentByIdAction {
	private CommentService commentservice;
	private int commentid;
	private Comment comment;
	public CommentService getCommentservice() {
		return commentservice;
	}
	public void setCommentservice(CommentService commentservice) {
		this.commentservice = commentservice;
	}
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public String execute() throws Exception{
		commentservice.deleteComment(commentid);
		return "success";
	}
}
