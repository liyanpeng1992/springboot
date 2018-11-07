package com.example.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
	/*
	@RestContriller的意思就是controller里的方法都以Json格式输出
		不用再写什么jackjson配置了
	@SpringBootApplocation开启了Spring的组件扫描和Springboot的自动配置功能
		相当于将一下三个注解组合在一起
	(1)@Configuration:表名该类使用基于Java的配置，将此类作为配置类
	（2）@CompnentScan:启用注解扫描
	(3)@EnableAutoConfiguration:开启springboot的自动配置功能
	 */


	@Autowired
	Conf conf;
	@Autowired
	Conf1 conf1;

	/*@EnableConfigurationProperties注解是用来开启对@ConfigurationProperties注解配置Bean的支持。
		也就是@EnableConfigurationProperties注解告诉Spring Boot 使能支持@ConfigurationProperties

		可省略！！！  但是必须有get（）方法
		*/

	@Autowired
	Conf2 conf2;

	// @Autowired
	// private Environment env;
	// 可以用环境变量的方式加载  env.getProperty("string.port")


	@RequestMapping("/hello")
	public String printHello() {
		System.out.println(conf);
		System.out.println(conf1);
		System.out.println(conf2);
		return "hello world !";
	}

}
