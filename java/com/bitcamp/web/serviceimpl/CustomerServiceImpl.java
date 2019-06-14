package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.service.CustomerService;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service // 클래스이름이 뭐든간에 어노테이션때문에 서비스가 된다.
public class CustomerServiceImpl implements CustomerService {

    @Override
    public void addCustomer(Object customer) {

    }

    @Override
    public List findCustomers() {
        return null;
    }

    @Override
    public List findCustomersByOption(Object option) {
        return null;
    }

    @Override
    public Object findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void updateCustomer(Object customer) {

    }

    @Override
    public void deleteCustomer(Object customer) {

    }





    
}