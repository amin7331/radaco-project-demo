package com.example.demo.business;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class BusinessType {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "businessType_sequence"
    )
    @SequenceGenerator(
            name = "businessType_sequence",
            sequenceName = "businessType_sequence",
            allocationSize = 1
    )
    private Long id;
    private String type;

    @OneToMany(mappedBy = "businessType")
    private List<Business> businessList;

    public BusinessType() {
    }

    public BusinessType(Long id, String type, List<Business> businessList) {
        this.id = id;
        this.type = type;
        this.businessList = businessList;
    }

    public BusinessType(String type, List<Business> businessList) {
        this.type = type;
        this.businessList = businessList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String businessType) {
        this.type = businessType;
    }

    @Override
    public String toString() {
        return "BusinessType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", businessList=" + businessList +
                '}';
    }
}
