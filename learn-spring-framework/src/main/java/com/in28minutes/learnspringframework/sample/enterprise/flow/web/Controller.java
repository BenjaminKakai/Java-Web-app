package com.in28minutes.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending response to the user in the right format
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	//"/Sum" => 100
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}





//Getting data



