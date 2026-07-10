package com.nt.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class CustomerOperationsController {

	@GetMapping("/")
	public  String showHomePage() {
		System.out.println("CustomerOperationsController.showHomePage()");
		
		return "welcome";
	}
}
