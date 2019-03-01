package com.neosofttech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring/api")
public class SpringController {
	@GetMapping("/")
public String welcome()
{
	return"welcome to  neosofttech your application is build successfully";
}
}
