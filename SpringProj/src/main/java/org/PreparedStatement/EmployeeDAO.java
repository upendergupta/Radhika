package org.PreparedStatement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public Boolean saveEmployee(Employee e) {

        String sql = "insert into employee values (?,?,?)";

        return template.execute(sql, new PreparedStatementCallback<Boolean>() {

            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, e.getId());
                ps.setString(2, e.getName());
                ps.setString(3, e.getSalary());

                Boolean b = ps.execute();

                return b;
            }
        });


    }


   /* public List<Employee> getAllEmployees() {
        List<Employee> addem = new ArrayList<>();

        return template.query("select * from employee", new ResultSetExtractor<List<Employee>>() {


            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()) {
                    Employee e = new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSalary(rs.getString(3));
                    addem.add(e);
                }


                return addem;
            }
        });


    }*/


    public List<Employee> getAllEmployeesRowMapper(){
        return template.query("select * from employee",new RowMapper<Employee>(){
            @Override
            public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {

                Employee e=new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getString(3));
                return e;
            }
        });
    }


}


