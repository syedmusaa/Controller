package com.example.SpringBootProjectDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
		@GetMapping("/payment")
		public String mypayment() {
			return"UPI";
		}
	}