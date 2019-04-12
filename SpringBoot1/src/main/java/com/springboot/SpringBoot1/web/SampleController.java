package com.springboot.SpringBoot1.web;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //加上这个注解 标识 类下所有的方法都是返回json格式  不需要每个方法都加responseBody
public class SampleController {

	@RequestMapping("/")
//	@ResponseBody  //为了返回json格式的数据
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}
