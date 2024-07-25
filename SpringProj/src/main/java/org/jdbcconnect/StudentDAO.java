package org.jdbcconnect;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {

    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int savestudent(Student e){



        String query="insert into student values( '"+e.getId()+"','"+e.getName()+"','"+e.getRollno()+"')";

        int number=template.update(query);
        return number;

    }

    public int updateStudent(Student e){



        String query="update student set name ='"+e.getName()+"' where id='"+e.getId()+"'";

        int number=template.update(query);
        return number;

    }


    public int deleteStudent(Student e){



        String query="delete from student  where id='"+e.getId()+"'";

        int number=template.update(query);
        return number;

    }



}
