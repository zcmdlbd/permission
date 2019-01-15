package com.mmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import sun.util.logging.resources.logging;



@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello;permission";
	}
}
