package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {

    private BusinessRepository businessRepository;
    private BusinessTypeRepository businessTypeRepository;

    @Autowired
    public BusinessService(BusinessRepository businessRepository, BusinessTypeRepository businessTypeRepository) {
        this.businessRepository = businessRepository;
        this.businessTypeRepository = businessTypeRepository;
    }

    public List<BusinessType> getBusinessTypeList(){
        return businessTypeRepository.findAll();
    }

    public void addNewBusiness(Business business) {
        businessRepository.save(business);
    }
}
