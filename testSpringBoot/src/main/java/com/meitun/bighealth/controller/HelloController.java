package com.meitun.bighealth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello/helloworld") 
	@ResponseBody
	public String helloworld(Model model) {
		return "helloworld";
	}
	
	@RequestMapping("/course/list") 
	@ResponseBody
	public String list(Model model) {
		return "这是一个孤独的页面，好孤独111";
	}

}
