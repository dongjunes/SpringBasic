package com.hibo.androidspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@ResponseBody
	@RequestMapping("/main")
	public String main(){
		return "hi";
	}
	
	@RequestMapping("/android")
	public void android(){
		System.out.println("android");
	}
}
