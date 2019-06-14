package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 * 
 * @param <CustomerDTO>
 */
@Component
public interface CustomerService<CustomerDTO> {
    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers();
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    
}