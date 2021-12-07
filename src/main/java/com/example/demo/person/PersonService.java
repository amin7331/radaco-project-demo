package com.example.demo.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final GenderRepository genderRepository;
    private final MilitaryStatusRepository militaryStatusRepository;


    @Autowired
    public PersonService(PersonRepository personRepository, GenderRepository genderRepository, MilitaryStatusRepository militaryStatusRepository) {
        this.personRepository = personRepository;
        this.genderRepository = genderRepository;
        this.militaryStatusRepository = militaryStatusRepository;
    }

    public List<Person> getPerson() {
        return personRepository.findAll();

    }

    public List<Gender> getGender() {
        return genderRepository.findAll();
    }

    public List<MilitaryStatus> getMilitaryStatus() {
        return militaryStatusRepository.findAll();
    }


    public void addNewPerson(Person person) {

//        Optional<Person> optional = personRepository.findPersonByEmail(person.getEmail());
//        if (optional.isPresent()) {
//            throw new IllegalStateException("email taken");
//        }
        personRepository.save(person);
    }
}
