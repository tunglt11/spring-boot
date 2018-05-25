package com.example.helloappengine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloappengine.bean.Idol;

@RestController
@RequestMapping("/idol")
public class IdolController {

	@RequestMapping(value = "/show", method = RequestMethod.GET, produces = "application/json")
	public List<Idol> getListIdol() {
		List<Idol> idolLst = new ArrayList<>();
		
		Idol ngocTrinh  = new Idol("Ngoc Trinh", "85-65-90");
		Idol ellyTran = new Idol("Elly Tran", "95-65-85");

		idolLst.add(ngocTrinh);
		idolLst.add(ellyTran);
 		return idolLst;
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hell to rest";
	}
}