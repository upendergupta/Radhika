package com.springdatajpa.springdatajpa.service;

import com.springdatajpa.springdatajpa.Model.Employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDAO {
    static List<Employee> emp=new ArrayList<>();
    static {
        emp.add(new Employee(101L,"Radhika","20000"));
        emp.add(new Employee(102L,"Upender","10000"));
        emp.add(new Employee(103L,"Muskan","30000"));
        emp.add(new Employee(104L,"Subhangi","50000"));
        emp.add(new Employee(105L,"Rishab","60000"));
        emp.add(new Employee(106L,"Lakshay","10000"));
    }
    public List<Employee> getAllEmployee() {
        return emp;
    }

    public List<Employee> saveEmploee(Employee employee) {

        emp.add(employee);
        return emp;
    }

    public List<Employee> deleteEmploee(Long id) {
        Optional emp1=emp.stream().filter(e->e.getId().equals(id)).findAny();
        emp.remove(emp1.get());
        return  emp;
    }
}
