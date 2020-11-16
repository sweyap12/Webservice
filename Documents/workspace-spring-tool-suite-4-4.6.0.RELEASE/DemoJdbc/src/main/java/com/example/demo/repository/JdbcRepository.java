package com.example.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.example.demo.details.EmpDetails;

@Repository
public class JdbcRepository {
	
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<EmpDetails> getAllEmps(){  
		 return jdbctemplate.query("select * from emp",new ResultSetExtractor<List<EmpDetails>>(){  
		    @Override  
		     public List<EmpDetails> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<EmpDetails> list=new ArrayList<EmpDetails>();  
		        while(rs.next()){  
		        EmpDetails e=new EmpDetails();  
		        e.setId(rs.getString(1));  
		        e.setName(rs.getString(2));   
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  }  
	
	public int delEmp(String id){  
	    String query="delete from emp where id='"+id+"' ";  
	    return jdbctemplate.update(query);  
	}  
	
	public int addEmp(EmpDetails e){  
	    String query="insert into emp values('"+e.getId()+"','"+e.getName()+"')";  
	    return jdbctemplate.update(query);  
	}  
	
	public int updateEmp(String id, EmpDetails e){  
	    String query="update emp set name='"+e.getName()+"'where id='"+id+"' ";  
	    return jdbctemplate.update(query);  
	}

	public List<EmpDetails> getEmps(String id) {
		
		 return jdbctemplate.query("select * from emp where id='"+id+"'",new ResultSetExtractor<List<EmpDetails>>(){  
			    @Override  
			     public List<EmpDetails> extractData(ResultSet rs) throws SQLException,  
			            DataAccessException {  
			      
			        List<EmpDetails> list=new ArrayList<EmpDetails>();  
			        while(rs.next()){  
			        EmpDetails e=new EmpDetails();  
			        e.setId(rs.getString(1));  
			        e.setName(rs.getString(2));   
			        list.add(e);  
			        }  
			        return list;  
			        }  
			    });  
			  }  

}
