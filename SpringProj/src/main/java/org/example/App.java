package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicatonContext3.xml");
        Ladki ladki= (Ladki) app.getBean("ladki");
        System.out.println(ladki);
    }
}
