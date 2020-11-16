package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

//class MockitoTest {
//
//	@RunWith(MockitoJUnitRunner.class)
//	public class EmployeeServiceTest {
//	 
//	    @Mock
//	    private RestTemplate restTemplate;
//	 
//	    @InjectMocks 
//	    public EmployeeService empService = new EmployeeService();
//	 
//	    @Test
//	    public void givenMockingIsDoneByMockito_whenGetIsCalled_shouldReturnMockedObject() {
//	        EmployeeService emp = new EmployeeService(“E001”,"Eric Simmons");
//	        Mockito
//	          .when(restTemplate.getForEntity(
//	            "http://127.0.0.1:8080/employee/1", EmployeeService.class))
//	          .thenReturn(new ResponseEntity(emp, HttpStatus.OK));
//	 
//	        Employee employee = empService.getEmployee(id);
//	        Assert.assertEquals(emp, employee);
//	    }
//	}
//
//}


