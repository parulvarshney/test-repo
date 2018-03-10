package com.test.onemg.controllers;

import com.test.onemg.requests.CustomerCreateRequest;
import com.test.onemg.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.POST)
    public void createCustomer(@RequestBody CustomerCreateRequest customer){
        customerService.createCustomer(customer);
    }

}
