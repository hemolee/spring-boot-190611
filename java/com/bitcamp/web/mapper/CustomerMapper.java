package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 * 
 * @param <CustomerDTO>
 */
@Repository
public interface CustomerMapper<CustomerDTO> {
    public void insetCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers();
    public List<CustomerDTO> selectCustomersByOption(CustomerDTO option);
    public CustomerDTO selectCustomerByCustomerId(String customerId);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
   
    
}