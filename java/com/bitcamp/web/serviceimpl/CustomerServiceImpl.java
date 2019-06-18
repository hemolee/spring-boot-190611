package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.mapper.CustomerMapper;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service // 클래스이름이 뭐든간에 어노테이션때문에 서비스가 된다.
public class CustomerServiceImpl implements CustomerService {
   
    @Autowired CustomerMapper customerMapper;

    @Override
    public void addCustomer(CustomerDTO customer) {
        customerMapper.insertCustomer(customer);
        
    }

    @Override
    public List<CustomerDTO> findCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {

    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {

    }

    @Override
    public int countAll() {
        return customerMapper.selectCount();
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {      

        return customerMapper.login(customer); //void로 하면 소진. 이렇게 받아서 리턴해주면... 담아진다..
    }    
}