package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 * 
 *
 */
@Repository   //autowired + xml 필요
public interface CustomerMapper {
    public void insertCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers();
    public List<CustomerDTO> selectCustomersByOption(CustomerDTO option);
    public CustomerDTO selectCustomerByCustomerId(String customerId);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
	public int selectCount();
    public CustomerDTO login(CustomerDTO customer); //값 소진하려면 RETURN값ㅇ 없는 VOID로 선언해주면 된다...
   
    
}