package com.tssProject.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Contact;
import com.tssProject.service.ContactService;

public class MessageAction extends ActionSupport {
    private ContactService contactservice;
    private String cname;
    private String cphone;
    private String cemail;
    private String cmessage;
    List<Contact> contactlist;
    public ContactService getContactservice() {
		return contactservice;
	}
	public void setContactservice(ContactService contactservice) {
		this.contactservice = contactservice;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCmessage() {
		return cmessage;
	}
	public void setCmessage(String cmessage) {
		this.cmessage = cmessage;
	}
	public List<Contact> getContactlist() {
		return contactlist;
	}
	public void setContactlist(List<Contact> contactlist) {
		this.contactlist = contactlist;
	}
	


public String execute() throws Exception{
	contactlist=contactservice.findMessage();
    return "success";
   }
}
