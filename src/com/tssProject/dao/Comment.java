package com.tssProject.dao;

import java.util.Date;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment implements java.io.Serializable {

	// Fields

	private Integer commentid;
	private Date comtime;
	private Integer articleId;
	private String content;
	private String tiltle;

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Integer articleId, String content) {
		this.articleId = articleId;
		this.content = content;
	}

	/** full constructor */
	public Comment(Date comtime, Integer articleId, String content,
			String tiltle) {
		this.comtime = comtime;
		this.articleId = articleId;
		this.content = content;
		this.tiltle = tiltle;
	}

	// Property accessors

	public Integer getCommentid() {
		return this.commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Date getComtime() {
		return this.comtime;
	}

	public void setComtime(Date comtime) {
		this.comtime = comtime;
	}

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTiltle() {
		return this.tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

}