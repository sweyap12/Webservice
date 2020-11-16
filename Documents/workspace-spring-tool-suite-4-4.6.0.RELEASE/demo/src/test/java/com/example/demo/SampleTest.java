package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.io.IOException;

import javax.swing.text.html.parser.Entity;
import javax.xml.ws.Response;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

class SampleTest {
	 
@Test
public void Test() throws ClientProtocolException, IOException{
	  
	 
	    HttpUriRequest request = new HttpGet( "http://127.0.0.1:8080/employees/");
	 
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	 
	   	assertEquals(HttpStatus.SC_OK,httpResponse.getStatusLine().getStatusCode());
	   	
	   	String expectedJson = "{\"AllEmployeeDetails\":[{\"id\":\"1\",\"name\":\"A\"},{\"id\":\"2\",\"name\":\"B\"},{\"id\":\"4\",\"name\":\"C\"}]}";
	   	String jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());
	   	
	   	assertEquals(expectedJson, jsonFromResponse);
	    }

@Test
public void TestId() throws ClientProtocolException, IOException{
	  
	    HttpUriRequest request = new HttpGet( "http://127.0.0.1:8080/employee/1");
	 
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	 
	   	assertEquals(HttpStatus.SC_OK,httpResponse.getStatusLine().getStatusCode());
	   	
	   	String expectedJson = "{\"EmployeeDetail\":{\"id\":\"1\",\"name\":\"A\"}}";
	   	String jsonFromResponse = EntityUtils.toString(httpResponse.getEntity());
	   	
	    	assertEquals(expectedJson, jsonFromResponse);
	    }



}