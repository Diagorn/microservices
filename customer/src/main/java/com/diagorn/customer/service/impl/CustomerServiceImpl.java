package com.diagorn.customer.service.impl;

import com.diagorn.customer.domain.Customer;
import com.diagorn.customer.domain.CustomerRegistrationRequest;
import com.diagorn.customer.factory.CustomerFactory;
import com.diagorn.customer.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = CustomerFactory.customerRegistrationRequestToCustomer(request);
    }
}
