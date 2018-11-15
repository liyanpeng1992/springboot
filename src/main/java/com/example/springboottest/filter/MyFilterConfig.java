package com.example.springboottest.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class MyFilterConfig {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	/*
	filters用于记录调用日志、排除有XSS威胁的字符串、执行权限校验等
	SpringBoot自动添加了OrderedCharacterEncodingFilter和HiddenHttpMethodFilter
	 */

	// @Bean
	// public RemoteIpFilter remoteIpFilter() {
	// 	return new RemoteIpFilter();
	// }

		 /*
		 共两个步骤：
		 1.实现Filter接口，实现Filter方法
		 2.添加@Configuration直接，将自定义Filter加入过滤连
		  */

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new MyFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("MyFilter");
		registration.setOrder(1);
		return registration;
	}


}

