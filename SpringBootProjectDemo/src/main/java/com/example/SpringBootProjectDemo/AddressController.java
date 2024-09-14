package com.example.SpringBootProjectDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@GetMapping("/address")
	public String myAddress() {
		return"House.no: 36 Road: GULAM MEHBOOB ROAD, CHOWKI TALYYA, Bhopal(MADHYA PRADESH)";
	}
	
	@GetMapping("/address1")
	public void myAddress1() {
		System.out.println("House.no: 36\n" +"Road: GULAM MEHBOOB ROAD, CHOWKI TALYYA\n" +"City: Bhopal\n" +"State: MADHYA PRADESH\n");
	}
	
	
	
}
