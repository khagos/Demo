package com.yyt.ppc.services;



import com.yyt.ppc.model.Person;

import java.util.List;

/**
 * Created by kibrom on 6/24/16.
 */
public interface PersonService {

    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}
