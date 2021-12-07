package com.example.demo.business;

import com.example.demo.user.UserInfo;

import javax.persistence.*;

@Entity
@Table
public class Business {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "business_sequence"
    )
    @SequenceGenerator(
            name = "business_sequence",
            sequenceName = "business_sequence",
            allocationSize = 1
    )
    private Long id;
    private String businessName;
    private String businessContactNumber;
    private String descriptionOfActivity;
    private String email;
    private String address;
    private Long economicCode;
    private Long registrationNumber;
    private Long nationalId;
    private String province;
    private String city;


    @OneToOne(mappedBy = "business")
    private UserInfo userInfo;

    @ManyToOne
    private BusinessType businessType;


    public Business(){
    }

    public Business(Long id,
                    String businessName,
                    String businessContactNumber,
                    String descriptionOfActivity,
                    String email,
                    String address,
                    Long economicCode,
                    Long registrationNumber,
                    Long nationalId,
                    String province,
                    String city,
                    UserInfo userInfo,
                    BusinessType businessType) {
        this.id = id;
        this.businessName = businessName;
        this.businessContactNumber = businessContactNumber;
        this.descriptionOfActivity = descriptionOfActivity;
        this.email = email;
        this.address = address;
        this.economicCode = economicCode;
        this.registrationNumber = registrationNumber;
        this.nationalId = nationalId;
        this.province = province;
        this.city = city;
        this.userInfo = userInfo;
        this.businessType = businessType;
    }

    public Business(String businessName,
                    String businessContactNumber,
                    String descriptionOfActivity,
                    String email,
                    String address,
                    Long economicCode,
                    Long registrationNumber,
                    Long nationalId,
                    String province,
                    String city,
                    UserInfo userInfo,
                    BusinessType businessType) {
        this.businessName = businessName;
        this.businessContactNumber = businessContactNumber;
        this.descriptionOfActivity = descriptionOfActivity;
        this.email = email;
        this.address = address;
        this.economicCode = economicCode;
        this.registrationNumber = registrationNumber;
        this.nationalId = nationalId;
        this.province = province;
        this.city = city;
        this.userInfo = userInfo;
        this.businessType = businessType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessContactNumber() {
        return businessContactNumber;
    }

    public void setBusinessContactNumber(String businessContactNumber) {
        this.businessContactNumber = businessContactNumber;
    }

    public String getDescriptionOfActivity() {
        return descriptionOfActivity;
    }

    public void setDescriptionOfActivity(String descriptionOfActivity) {
        this.descriptionOfActivity = descriptionOfActivity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getEconomicCode() {
        return economicCode;
    }

    public void setEconomicCode(Long economicCode) {
        this.economicCode = economicCode;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getNationalId() {
        return nationalId;
    }

    public void setNationalId(Long nationalId) {
        this.nationalId = nationalId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", user=" + userInfo +
                ", businessType=" + businessType +
                '}';
    }
}
