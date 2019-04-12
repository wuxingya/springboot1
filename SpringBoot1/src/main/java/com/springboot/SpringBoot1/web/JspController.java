package com.springboot.SpringBoot1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 整合jsp页面
 * @author Administrator
 *
 */
@Controller
public class JspController {

	@RequestMapping("/getJspIndex")
	public String getJspIndex() {
		return "springboot";
	}
}
