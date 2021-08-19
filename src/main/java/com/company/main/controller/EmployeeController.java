package com.company.main.controller;

import com.company.main.model.Employee;
import com.company.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api" )
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping(value = "/save")
    public Employee save(@RequestBody Employee employee){
        service.save(employee);
        return employee;
    }

    @GetMapping(value = "/list")
    public List<Employee> employeeList(){
       return service.getAllEmployee();
    }
    @GetMapping(value = "/list/{id}")
    public Employee getEmployeeWithId(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public  String delete(@PathVariable(value = "id") Long id){
        service.deleteById(id);
        return id+" Deleted Successfully";
    }
}
