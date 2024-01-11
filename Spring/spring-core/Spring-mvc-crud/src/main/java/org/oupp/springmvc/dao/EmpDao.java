package org.oupp.springmvc.dao;

import lombok.Setter;
import org.oupp.springmvc.model.Emp;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Setter
public class EmpDao {

    JdbcTemplate jdbcTemplate;

    public int save(Emp emp) {
        String sql = "insert into emp99 (name,salary,designation) values ('" + emp.getName() + "'," + emp.getSalary() + ",'" + emp.getDesignation() + "');";
        return jdbcTemplate.update(sql);
    }

    public int update(Emp emp) {
        String sql = "update emp99 set name='" + emp.getName() + "',salary=" + emp.getSalary() + ",designation='" + emp.getDesignation() + "' where id=" + emp.getId() + ";";
        return jdbcTemplate.update(sql);
    }

    public int delete(int id){
        String sql="delete from emp99 where id="+id+";";
        return jdbcTemplate.update(sql);
    }

    public Emp getEmployeeById(int id){
        String sql="select * from emp99 where id=?;";
        return jdbcTemplate.queryForObject(sql,new Object[] {id},new BeanPropertyRowMapper<Emp>(Emp.class));
    }

    public List<Emp> getEmployees(){
        String sql="select * from emp99 ;";
        return jdbcTemplate.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int row) throws SQLException {
                Emp e=new Emp();
                e.setId(resultSet.getInt(1));
                e.setName(resultSet.getString(2));
                e.setSalary(resultSet.getFloat(3));
                e.setDesignation(resultSet.getString(4));

                return e;
            }
        });
    }
}
