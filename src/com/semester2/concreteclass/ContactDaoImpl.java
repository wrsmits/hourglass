package com.semester2.concreteclass;

import com.semester2.interfaces.ContactDao;
import com.semester2.models.Contact;
import com.semester2.models.Person;

import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao {

    //List is working as a datasource e.g. Microsoft Dynamics 365 Business Central
    List<Contact> contacts;

    public ContactDaoImpl() {
        contacts = new ArrayList<Contact>();
        Contact c1 = new Contact(1, "w.smits@student.fontys.nl", "Wesley", "Smits", "+31 6 24 78 12 42");
        contacts.add(c1);
    }

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public Contact getContactById(int id) {
        return null;
    }

    @Override
    public void updateContact(Contact contact) {

    }

    @Override
    public void deleteContact(Contact contact) {

    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(Person person) {

    }
}
