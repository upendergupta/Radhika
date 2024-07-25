package org.PreparedStatement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;




class ABC{
    public static void main(String[] args) {

        PreparedStatementCallback abc= new PreparedStatementCallback() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                return null;
            }
        };

    }
}
