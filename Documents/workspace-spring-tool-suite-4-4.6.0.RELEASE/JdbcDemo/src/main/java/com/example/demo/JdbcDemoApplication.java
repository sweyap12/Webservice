package com.example.demo;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.details.EmpDetails;
import com.example.Repository.EmployeeJDBCRepository;
@ComponentScan("com.example.Repository") //to scan packages mentioned
//@EnableRepositories("com.example.Repository")
@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
 
    @Autowired
    private EmployeeJDBCRepository employeeRepository;
 
    @Override
    public void run(String... args) throws Exception {

        logger.info("Inserting -> {}", employeeRepository.insert(new EmpDetails("1", "Ramesh")));
        logger.info("Inserting -> {}", employeeRepository.insert(new EmpDetails("2", "John")));
        logger.info("Inserting -> {}", employeeRepository.insert(new EmpDetails("3", "tony")));
  
        logger.info("EmpDetails id 1 -> {}", employeeRepository.findById("2"));
       // System.out.println("abc");

        logger.info("Update 2 -> {}", employeeRepository.update(new EmpDetails("2", "ram")));

        employeeRepository.deleteById("3");

        logger.info("All users -> {}", employeeRepository.findAll());
    }
 
	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

}
