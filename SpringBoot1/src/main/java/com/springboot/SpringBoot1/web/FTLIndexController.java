package com.springboot.SpringBoot1.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/***
 * 整合 freemarker 页面
 * @author Administrator
 *
 */
@Controller  //跳转页面 不需要返回json  所以不能使用restController
public class FTLIndexController {

	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String, Object> map) {
		map.put("name", "垃圾");
		map.put("sex", "0");
		return "ftlIndex";
	}
}
