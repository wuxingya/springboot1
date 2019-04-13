package com.springboot.SpringBoot1.aop;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import lombok.Data;
/***
 * 可以做日志收集  kafka  mongodb  redis  日志收集 分布式
 * @author Administrator
 *
 */
@Data
@Aspect
@Component
public class WebLogAspect {

	private final Logger logger  = LoggerFactory.getLogger(WebLogAspect.class);
 	
	@Pointcut("execution(public * com.springboot.SpringBoot1.web.*.*(..))")
	public void  webLog() {
		
	}
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) {
		//接受请求
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = servletRequestAttributes.getRequest();
		
		logger.info("url:{0}"+request.getRequestURI());
		
		Enumeration<String> pnamEnumeration =request.getParameterNames();
		
		
		
		
	}
	@After("webLog()")
	public void doAfter() {
		logger.info("后置通知");
	}
	
	
	@AfterReturning(returning = "obj",pointcut = "webLog()")
	public void doAfterReturning(Object obj) {
		//处理完成后 返回内容
		logger.info("response:"+obj);
	}
	
}
