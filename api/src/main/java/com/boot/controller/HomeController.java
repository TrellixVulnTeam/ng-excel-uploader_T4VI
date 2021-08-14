package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/home")
public class HomeController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home() {
		return "Blogposts API, home page!";
	}

}
