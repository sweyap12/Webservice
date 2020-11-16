package com.example.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.details.EmpDetails;

@Repository
public class EmployeeJDBCRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class EmpDetailsRowMapper implements RowMapper < EmpDetails > {
        @Override
        public EmpDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        	EmpDetails employee = new EmpDetails();
            employee.setId(rs.getString("id"));
            employee.setName(rs.getString("name"));
            return employee;
        }
    }

    public List < EmpDetails > findAll() {
        return jdbcTemplate.query("select * from emp", new EmpDetailsRowMapper());
    }

    public Optional < EmpDetails > findById(String id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from emp where id=?", new Object[] {
                id
            },
            new BeanPropertyRowMapper < EmpDetails > (EmpDetails.class)));
    }

    public int deleteById(String id) {
        return jdbcTemplate.update("delete from emp where id=?", new Object[] {
            id
        });
    }

    public int insert(EmpDetails employee) {
        return jdbcTemplate.update("insert into emp (id,name) " + "values(?, ?)",
            new Object[] {
                employee.getId(), employee.getName()
            });
    }

    public int update(EmpDetails employee) {
        return jdbcTemplate.update("update emp " + " set name" + " where id = ?",
            new Object[] {
                employee.getName(), employee.getId()
            });
    }
}