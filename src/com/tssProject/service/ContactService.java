package com.tssProject.service;

import java.util.List;

import com.tssProject.dao.Contact;
import com.tssProject.dao.ContactDAO;

public interface ContactService {

	public abstract ContactDAO getContactdao();

	public abstract void setContactdao(ContactDAO contactdao);

	public  boolean addContact(Contact contact);
	public List <Contact> findMessage();
	


}