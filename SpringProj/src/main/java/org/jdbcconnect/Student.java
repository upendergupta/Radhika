package org.jdbcconnect;


public class Student {

    private Integer id;

    private String name;

    private String rollno;

    public Student(Integer id, String name, String rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
