package com.tssProject.dao;

import java.util.Date;


/**
 * Topic entity. @author MyEclipse Persistence Tools
 */

public class Topic  implements java.io.Serializable {


    // Fields    

     private Integer articleId;
     private String userName;
     private String tiltle;
     private String tcontent;
     private Date createtime;


    // Constructors

    /** default constructor */
    public Topic() {
    }

    
    /** full constructor */
    public Topic(String userName, String tiltle, String tcontent, Date createtime) {
        this.userName = userName;
        this.tiltle = tiltle;
        this.tcontent = tcontent;
        this.createtime = createtime;
    }

   
    // Property accessors

    public Integer getArticleId() {
        return this.articleId;
    }
    
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTiltle() {
        return this.tiltle;
    }
    
    public void setTiltle(String tiltle) {
        this.tiltle = tiltle;
    }

    public String getTcontent() {
        return this.tcontent;
    }
    
    public void setTcontent(String tcontent) {
        this.tcontent = tcontent;
    }

    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
   








}