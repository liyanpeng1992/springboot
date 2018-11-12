package com.example.springboottest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@PropertySource("classpath:my.properties")
@ConfigurationProperties(prefix = "my")
@Component
public class Conf2 {

	//此种javabean的方式加载配置文件必须有get方法

	private String secret;
	private int number;
	private String introduce;
	private List<String> host;

	@Override
	public String toString() {
		return "Conf2{" +
				"secret='" + secret + '\'' +
				", number=" + number +
				", introduce='" + introduce + '\'' +
				", host=" + host +
				'}';
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public List<String> getHost() {
		return host;
	}

	public void setHost(List<String> host) {
		this.host = host;
	}
}
