package com.cnpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnpc.util.PasswordUtils;

@Controller
public class GenerateRandomPassController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/generatepass")
	@ResponseBody
	public String generatepass() {
		return PasswordUtils.genRandomNum(12);
	}
	
}
