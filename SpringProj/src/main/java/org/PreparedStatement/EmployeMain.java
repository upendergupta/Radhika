package org.PreparedStatement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployeMain {
    public static void main(String[] args) {


        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContextJDBCNamed.xml");

        EmployeeDAO dao=(EmployeeDAO)ctx.getBean("employeeDAO");

       // System.out.println(dao.saveEmployee(new Employee(103,"Muskan","400000")));


        List<Employee> employees=dao.getAllEmployeesRowMapper();

        //employees.stream().forEach(e-> System.out.println(e));

        for(Employee e: employees)
        {
            System.out.println(e);
        }

    }
}
