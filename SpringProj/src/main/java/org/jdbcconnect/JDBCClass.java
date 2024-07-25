package org.jdbcconnect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JDBCClass {

    public static void main(String[] args)  {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextJDBC.xml");
         StudentDAO dao=context.getBean(StudentDAO.class);
         /*Student st=new Student();
         st.setId(new Integer(101));
         st.setName("Radhika");
         st.setRollno("1011111");
         int abc=dao.savestudent(st);*/


        /*Student st1=new Student();
        st1.setId(102);
        st1.setName("Upender");
        st1.setRollno("343434");
        int abc1=dao.savestudent(st1);

        System.out.println(abc1);*/

        Student st2=new Student();
        st2.setId(103);
        st2.setName("Subhagi");
        st2.setRollno("45454");
        int abc2=dao.deleteStudent(st2);

        System.out.println(abc2);





    }

}





 /*try {
            Class.forName("com.mysql.jdbc.Driver");

            String  url="jdbc:mysql://localhost:3306/radhika";
            String name="root";
            String pass="root";
            Connection con = DriverManager.getConnection(url,name,pass);

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from student");

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2) +" "+rs.getString(3));
            }


        }catch (Exception e){
            System.out.println(e);
        }*/
