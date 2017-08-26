package com.tssProject.service;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tssProject.dao.Contact;
import com.tssProject.dao.ContactDAO;
import com.tssProject.dao.User;

public class ContactServiceImpl implements ContactService {
  private ContactDAO contactdao;

/* (non-Javadoc)
 * @see com.tssProject.service.ContactService#getContactdao()
 */
public ContactDAO getContactdao() {
	return contactdao;
}

/* (non-Javadoc)
 * @see com.tssProject.service.ContactService#setContactdao(com.tssProject.dao.ContactDAO)
 */
public void setContactdao(ContactDAO contactdao) {
	this.contactdao = contactdao;
}

/* (non-Javadoc)
 * @see com.tssProject.service.ContactService#addContact(com.tssProject.dao.Contact)
 */
public boolean addContact(Contact contact){

	String ContactName=contact.getCname();
	List<Contact> contactlist=contactdao.findByCname(ContactName);
	
	if(contactlist.isEmpty()){
        contactdao.save(contact);
		return true;
	}else{
		return false;	
	
    }
}
	public List <Contact> findMessage(){
		  return contactdao.findAll();

   }
}


