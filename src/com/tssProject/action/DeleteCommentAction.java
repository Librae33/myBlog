package com.tssProject.action;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.service.CommentService;

public class DeleteCommentAction extends ActionSupport {
	private CommentService commentservice;
	private int commentid;
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
	public String execute() throws Exception{
		commentservice.deleteComment(commentid);
		JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "评论删除成功！");
		return"success";
	}
}
