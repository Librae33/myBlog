package com.tssProject.action;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Contact;
import com.tssProject.service.ContactService;


public class ContactAction extends ActionSupport {
  private ContactService contactservice;
  private String cname;
  private long cphone;
  public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public long getCphone() {
	return cphone;
}
public void setCphone(long cphone) {
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

private String cemail;
  private String cmessage;
public ContactService getContactservice() {
	return contactservice;
}
public void setContactservice(ContactService contactservice) {
	this.contactservice = contactservice;
}

public String execute()throws Exception{
	Contact contact=new Contact();
	contact.setCname(cname);
	contact.setCmessage(cmessage);
	contact.setCphone(cphone);
	contact.setCemail(cemail);
	contactservice.addContact(contact);
	return "success";
}
}
