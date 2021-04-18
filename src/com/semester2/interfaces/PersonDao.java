package com.semester2.interfaces;

import com.semester2.models.*;

import java.util.List;

public interface PersonDao {

    public List<Person> getAllPersons();

    public Person getPersonById(int personNo);

    public void updatePerson(Person person);

    public void deletePerson(Person person);
}
