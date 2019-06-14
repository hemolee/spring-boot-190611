package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * EmployeeService
 * 
 * @param <EmployeeDTO>
 */
@Component
public interface EmployeeService<EmployeeDTO> {
    public void addEmployee(EmployeeDTO employee);
    public List<EmployeeDTO> findEmployees();
    public List<EmployeeDTO> findEmplofyeesByOption(EmployeeDTO option);
    public EmployeeDTO findEmployeeById(String employeeId);
    public void updateEmployee(EmployeeDTO employee);
    public void deleteEmployee(EmployeeDTO employee);
    
    
}