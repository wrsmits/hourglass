package com.semester2.concreteclass;

import com.semester2.interfaces.PersonDao;
import com.semester2.models.*;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    //List is working as a datasource e.g. Microsoft Dynamics 365 Business Central
    List<Person> persons;

    public PersonDaoImpl() {
        persons = new ArrayList<Person>();
        Person p1 = new Person(1, "w.smits@student.fontys.nl", "Wesley", "Smits");
        persons.add(p1);
    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }

    @Override
    public Person getPersonById(int personNo) {
        return null;
    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(Person person) {

    }
}
