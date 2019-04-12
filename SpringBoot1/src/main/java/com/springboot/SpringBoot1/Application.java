package com.springboot.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication    //此注解 代替以下 三个注解功能
//@EnableAutoConfiguration //自动装配bean  默认只能扫当前类
//@ComponentScan   //扫描bean
//@Configuration   //配置
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
