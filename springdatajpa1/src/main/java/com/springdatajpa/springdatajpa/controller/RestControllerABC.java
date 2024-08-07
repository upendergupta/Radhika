package com.springdatajpa.springdatajpa.controller;


import com.springdatajpa.springdatajpa.Model.Employee;
import com.springdatajpa.springdatajpa.service.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerABC {
    @Autowired
    private EmployeeDAO dao;

    @GetMapping("/getAllEmployeeInformation")
    public List<Employee> getHhelloello(){
        List<Employee> emp=dao.getAllEmployee();
        return emp;
    }

    @PostMapping("/saveEmployeeInformation")
    public List<Employee> saveEmployee(@RequestBody Employee employee){
        List<Employee> emp=dao.saveEmploee(employee);
        return emp;
    }


    @DeleteMapping("/deleteEmployeeInformation/{id}")
    public List<Employee> deleteEmployee(@PathVariable Long id){
        List<Employee> emp=dao.deleteEmploee(id);
        return emp;
    }
}
