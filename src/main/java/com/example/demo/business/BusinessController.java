package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/")
public class BusinessController {

    private BusinessService businessService;

    @Autowired
    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("businessType")
    public List<BusinessType> getBusinessTypeList() {
        return businessService.getBusinessTypeList();
    }

    @PostMapping("business")
    @CrossOrigin(origins = "http://localhost:3000/businessRegister")
    public void registerNewBusiness(@RequestBody Business business){
        businessService.addNewBusiness(business);
    }
}
