package com.example.demo.user;

import com.example.demo.business.Business;
import com.example.demo.person.Person;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "\"user\"")
public class UserInfo {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    private Long id;
    @NotEmpty(message = "نام کاربری نمیتواند خالی باشد")
    @Size(min = 5, max = 15, message = "نام کاربری باید بین 5 تا 15 کاراکتر باشد")
    private String username;
    @NotEmpty(message = "رمز عبور نمیتواند خالی باشد")
    @Size(min = 6, max= 20, message = "رمز عبور باید بین 6 تا 20 کاراکتر باشد")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;
    @OneToOne(cascade = CascadeType.ALL)
    private Business business;

    public UserInfo() {
    }

    public UserInfo(String username, String password, Person person, Business business) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.business = business;
    }

    public UserInfo(Long id, String username, String password, Person person, Business business) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.person = person;
        this.business = business;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                ", business=" + business +
                '}';
    }
}
