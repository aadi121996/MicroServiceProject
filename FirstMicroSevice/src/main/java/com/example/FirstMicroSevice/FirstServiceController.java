package com.example.FirstMicroSevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstServiceController {

	@GetMapping("/")
	public String getData() {
		System.out.println("Successfully .................");
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> value = template.getForEntity("http://localhost:8010/getFacultyData", String.class);
		return value + "Suceesfull Response";

	}
}
