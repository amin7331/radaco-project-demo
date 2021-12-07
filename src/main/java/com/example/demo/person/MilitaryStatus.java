package com.example.demo.person;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class MilitaryStatus {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String status;

    @OneToMany(mappedBy = "militaryStatus")
    private List<Person> personList;

    public MilitaryStatus() {
    }

    public MilitaryStatus(Long id, String status, List<Person> personList) {
        this.id = id;
        this.status = status;
        this.personList = personList;
    }

    public MilitaryStatus(String status, List<Person> personList) {
        this.status = status;
        this.personList = personList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MilitaryStatus{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", personList=" + personList +
                '}';
    }
}
