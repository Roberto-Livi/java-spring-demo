package com.example.javaspringdemo.service;

import com.example.javaspringdemo.dao.PersonDao;
import com.example.javaspringdemo.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

}
