package com.springboot.SpringBoot1.web;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@RestController
@Data
@Slf4j
public class ComErrorController {
	private final org.slf4j.Logger logger  = LoggerFactory.getLogger(ComErrorController.class);
	
	@RequestMapping("/errorMap")
	public String errorMap(int j) {
		int i = j/1;
		logger.info("这是日志");
		return "success"+i;
	}
}
