package com.springboot.SpringBoot1.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * 全局捕获异常
 * @author Administrator
 *
 */
@ControllerAdvice(basePackages = "com.springboot.SpringBoot1.web")
public class GloablExceprionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> errorJson(){
		Map<String, Object> errorMap = new HashMap<String, Object>();
		errorMap.put("errorCode", "500");
		errorMap.put("errorMsg", "系统异常");
		return errorMap;
	}

}
