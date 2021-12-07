package com.example.demo.person;

import com.example.demo.user.UserInfo;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table
public class Person {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    private Long id;
    @NotBlank(message = "نام نمیتواند خالی باشد")
    private String name;
    @NotBlank(message = "نام خانوادگی نمیتواند خالی باشد")
    private String lastName;
    @NotNull(message = "تاریخ تولد باید مشحض شود")
    private Date dateOfBirth;
    @NotNull(message = "کد ملی نمیتواند خالی باشد")
    private Long nationalCode;

    @OneToOne(mappedBy = "person")
    private UserInfo userInfo;
    @ManyToOne
    private Gender gender;
    @ManyToOne
    private MilitaryStatus militaryStatus;
    @NotEmpty(message = "شهر حتما باید انتخاب شود")
    private String city;
    private Integer region;
    @NotEmpty(message = "استان حتما باید انتخاب شود")
    private String province;
    @NotNull(message = "کد پستی نمیتواند خالی باشد")
    private Long postalCode;
    @NotBlank(message = "شماره تلفن ثابت نمیتواند خالی باشد")
    private String phoneNumber;
    @NotBlank(message = "شماره تلفن همراه نمیتواند خالی باشد")
    private String mobileNumber;
    @Email()
    private String email;

    protected Person(Gender gender,
                  Long id,
                  String name,
                  String lastName,
                  Date dateOfBirth,
                  Long nationalCode,
                  String city,
                  MilitaryStatus militaryStatus,
                  Integer region,
                  String province,
                  Long postalCode,
                  String phoneNumber,
                  String mobileNumber,
                  String email) {
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalCode = nationalCode;
        this.province = province;
        this.city = city;
        this.militaryStatus = militaryStatus;
        this.region = region;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public Person() {
    }

    public Person(
            Gender gender,
            String name,
            String lastName,
            Date dateOfBirth,
            Long nationalCode,
            String city,
            MilitaryStatus militaryStatus,
            Integer region,
            String province,
            Long postalCode,
            String phoneNumber,
            String mobileNumber,
            String email) {
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalCode = nationalCode;
        this.province = province;
        this.city = city;
        this.militaryStatus = militaryStatus;
        this.region = region;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Long nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public MilitaryStatus getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(MilitaryStatus militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationalCode=" + nationalCode +
                ", gender=" + gender +
                ", militaryStatus=" + militaryStatus +
                ", city='" + city + '\'' +
                ", region=" + region +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
