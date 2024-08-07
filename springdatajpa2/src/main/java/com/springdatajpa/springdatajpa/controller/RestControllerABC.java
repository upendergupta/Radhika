package com.springdatajpa.springdatajpa.controller;


import com.springdatajpa.springdatajpa.Model.Employee;
import com.springdatajpa.springdatajpa.service.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestControllerABC {
    @Autowired
    private EmployeeDAO dao;

    @GetMapping("/getAll")
    public List<Employee> getHello(){
        List<Employee> emp=dao.getAllEmployee();
        return emp;
    }

    @GetMapping("/getOne/{id}")
    public List<Employee> getHello(@PathVariable Long id){
        List<Employee> emp=new ArrayList<>();
        emp.add(dao.findbyID(id));
        return  emp;
    }

    @PostMapping("/saveAll")
    public List<Employee> saveEmployee(@RequestBody Employee employee){
        List<Employee> emp=dao.saveEmploee(employee);
        return emp;
    }


    @DeleteMapping("/deleteEmp/{id}")
    public List<Employee> deleteEmployee(@PathVariable Long id){
        Employee emp=dao.findbyID(id);
        List<Employee> emp1=dao.deleteEmploee(emp);
        return emp1;
    }
}
