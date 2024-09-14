package com.example.SpringBootProjectDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
	
	@GetMapping("/customer")
	public String customerName() {
		return"Customer Name:- Syed Musa Ali";
	}
}
