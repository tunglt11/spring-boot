package com.example.helloappengine.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ApplicationController {

	@GetMapping("/deploy-epod-sample")
	public String sayHello() {
		return "This is the sample flow deploy product to epod on google cloud";
	}
}