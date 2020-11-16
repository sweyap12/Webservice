package com.details;
//package com.example.demo.details;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class EmpDao {
//	
//	private static final String URL = "jdbc:mysql://localhost:3306/employee";
//	private static final String USERNAME = "root";
//	private static final String PASSWORD = "root";
//	private static final String FindAllEmps = "SELECT * FROM EMPLOYEE.EMPLOYE";
//	private static EmpDao instance;
//	private Connection connection=null;
//	private PreparedStatement statement = null; 
//	private ResultSet result= null;
//	
//	private EmpDao(){	
//	}
//	public static EmpDao getinstance()
//	{
//		if(instance==null)
//		{
//			instance = new EmpDao();
//		}
//		return instance;
//	}
//	public List<EmpDetails> getAllEmps()
//	{
//		List<EmpDetails> employe= new ArrayList<EmpDetails>();
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//			statement = connection.prepareStatement(FindAllEmps);
//			result = statement.executeQuery();
//			while(result.next())
//			{
//				String id = result.getString("id");
//				String name = result.getString("name");
//				EmpDetails empdetails= new EmpDetails("id", "name");
//				employe.add(empdetails);
//				
//			}
//		} catch (SQLException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		return employe;
//	}
//}
