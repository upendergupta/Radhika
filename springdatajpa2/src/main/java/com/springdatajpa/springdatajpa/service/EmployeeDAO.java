package com.springdatajpa.springdatajpa.service;

import com.springdatajpa.springdatajpa.Model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDAO {


    @Autowired
    private jparepositoryI1 jpaRepositoryclass;

    public List<Employee> getAllEmployee() {
        return jpaRepositoryclass.findAll();
    }

    public List<Employee> saveEmploee(Employee employee) {
        jpaRepositoryclass.save(employee);
        List<Employee> emp= getAllEmployee();
        return emp;
    }

    public List<Employee> deleteEmploee(Employee emp) {
        jpaRepositoryclass.delete(emp);
        List<Employee> emp1=getAllEmployee();
        return  emp1;
    }

    public Employee findbyID(Long id) {
        Optional<Employee> opt=jpaRepositoryclass.findById(id);

        return  opt.get();
    }
}
