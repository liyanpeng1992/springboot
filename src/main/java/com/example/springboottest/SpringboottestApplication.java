package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottestApplication {
/*
	@SpringBootApplocation开启了Spring的组件扫描和Springboot的自动配置功能
	相当于将一下三个注解组合在一起
			(1)@Configuration:表名该类使用基于Java的配置，将此类作为配置类
	       （2）@CompnentScan:启用注解扫描
			(3)@EnableAutoConfiguration:开启springboot的自动配置功能
 */


	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
	}
}
