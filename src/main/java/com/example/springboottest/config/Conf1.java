package com.example.springboottest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:config/my.properties")
@Component
public class Conf1 {
	// Spring Boot 默认的配置文件地址有两个：（application.properties 为默认的配置文件名称）
	// 		1. classpath： 即放在resources里面。
	// 		2. classpath：config里面。

	// @PropertySource配置文件路径设置，在类上添加注解，如果在默认路径下可以不添加该注解。
	// 需要用@PropertySource的有：
	//
	// 例如非application.properties，classpath:config/my.properties指的是src/main/resources目录下config目录下的my.properties文件，
	// 例如有多配置文件引用，若取两个配置文件中有相同属性名的值，则取值为最后一个配置文件中的值
	// 在application.properties中的文件，直接使用@Value读取即可，applicarion的读取优先级最高

	@Value("${my.name}")
	private String name;
	@Value("${my.age}")
	private int age;
	@Value("${my.password}")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Conf1{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
