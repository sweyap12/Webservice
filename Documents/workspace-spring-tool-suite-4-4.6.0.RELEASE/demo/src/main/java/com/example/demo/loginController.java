package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller


public class loginController {
	
	@RequestMapping(value="/login")
	

	public String Testing()
	{
		return "Hiiii Spring";
	}

}
