package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "api/person")
    public List<Person> getPersonInformation() {
        return personService.getPerson();
    }

    @GetMapping(path = "api/gender")
    public List<Gender> getGender() {
        return personService.getGender();
    }

    @GetMapping(path = "api/military")
    public List<MilitaryStatus> getMilitaryStatus() {
        return personService.getMilitaryStatus();
    }

    @PostMapping(path = "api/test")
    @CrossOrigin(origins = "http://localhost:3000/register")
    public void registerNewPerson(@RequestBody Person person) {
        personService.addNewPerson(person);
    }

}
