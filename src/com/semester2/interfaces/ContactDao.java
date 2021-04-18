package com.semester2.interfaces;

import com.semester2.models.Contact;

import java.util.List;

public interface ContactDao extends PersonDao {

    public List<Contact> getAllContacts();

    public Contact getContactById(int id);

    public void updateContact(Contact contact);

    public void deleteContact(Contact contact);
}
