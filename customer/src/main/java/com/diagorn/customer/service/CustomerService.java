package com.diagorn.customer.service;

import com.diagorn.customer.domain.CustomerRegistrationRequest;

/**
 * Service for dealing with customers
 */
public interface CustomerService {
    /**
     * Register a new customer
     * @param request - registration request
     */
    void registerCustomer(CustomerRegistrationRequest request);
}
