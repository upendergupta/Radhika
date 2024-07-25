package org.SpringWithhibernate;

import jakarta.transaction.Transactional;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HibernateClass {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContextHibernate.xml");
        EmployeeDao dao= (EmployeeDao) applicationContext.getBean("employeeDao");

        /*Employee e=dao.getById(101);
        System.out.println(e);*/

        dao.saveEmployee(new Employee(101,"Upender","1000"));

        System.out.println(dao.getEmployees());
    }
}
