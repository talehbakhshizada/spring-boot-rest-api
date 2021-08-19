package com.company.main.service;

import com.company.main.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public Employee getById(long id);

    public void save(Employee employee);

    public void deleteById(long id);

}
