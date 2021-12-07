package com.example.demo.person;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Gender {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "gender_sequence"
    )
    @SequenceGenerator(
            name = "gender_sequence",
            sequenceName = "gender_sequence",
            allocationSize = 1
    )
    private int id;
    private String gender;

    @OneToMany(mappedBy = "gender")
    private List<Person> personList;

    public Gender() {
    }

    public Gender(int id, String gender, List<Person> personList) {
        this.id = id;
        this.gender = gender;
        this.personList = personList;
    }

    public Gender(String gender, List<Person> personList) {
        this.gender = gender;
        this.personList = personList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", persons=" + personList +
                '}';
    }
}
