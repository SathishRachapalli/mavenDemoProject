package com.example.smControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentController {
	
	@GetMapping("/show")
	@ResponseBody
	public String testing()
	{
	
		return "testing done successfully!!!";
	}
	
	
		

}
