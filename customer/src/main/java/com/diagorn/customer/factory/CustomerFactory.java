package com.diagorn.customer.factory;

import com.diagorn.customer.domain.Customer;
import com.diagorn.customer.domain.CustomerRegistrationRequest;

/**
 * Factory for customer types transformations
 */
public class CustomerFactory {
    /**
     * Extract a customer from customer registration request
     * @param request - customer registration request
     * @return customer object
     */
    public static Customer customerRegistrationRequestToCustomer(CustomerRegistrationRequest request) {
        if (request == null) {
            return null;
        }

        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setEmail(request.getEmail());

        return customer;
    }
}
