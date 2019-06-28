package com.app.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("show")
	public String showPage(Model m) {
		m.addAttribute("msg", "WELCOME TO APP"+new Date());
		
		
		return "HOME";
		
	}
}
