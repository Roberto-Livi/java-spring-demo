package com.example.javaspringdemo.api;

import com.example.javaspringdemo.model.Person;
import com.example.javaspringdemo.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
