package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class laptop {
	
	
	int lapnum;
	String brand;
	public int getLapnum() {
		return lapnum;
	}
	public void setLapnum(int lapnum) {
		this.lapnum = lapnum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void show()
	{
		System.out.println("laptop");
		
	}

}
