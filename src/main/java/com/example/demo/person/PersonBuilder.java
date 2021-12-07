package com.example.demo.person;

import java.util.Date;

public class PersonBuilder {
    private Gender gender;
    private Long id;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private Long nationalCode;
    private String city;
    private MilitaryStatus militaryStatus;
    private Integer region;
    private String province;
    private Long postalCode;
    private String phoneNumber;
    private String mobileNumber;
    private String email;

    public PersonBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public PersonBuilder setNationalCode(Long nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setMilitaryStatus(MilitaryStatus militaryStatus) {
        this.militaryStatus = militaryStatus;
        return this;
    }

    public PersonBuilder setRegion(Integer region) {
        this.region = region;
        return this;
    }

    public PersonBuilder setProvince(String province) {
        this.province = province;
        return this;
    }

    public PersonBuilder setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Person build() {
        if(id == null){
            new Person(gender, name, lastName, dateOfBirth, nationalCode, city, militaryStatus, region, province, postalCode, phoneNumber, mobileNumber, email);
        }
        return new Person(gender, id, name, lastName, dateOfBirth, nationalCode, city, militaryStatus, region, province, postalCode, phoneNumber, mobileNumber, email);
    }
}