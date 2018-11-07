package com.example.springboottest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Conf {
	@Value("${string.port}")
	private int intPort;
	@Value("${string.port}")
	private String stringPort;
	@Value("${db.link.url}")
	private String dbUrl;
	@Value("${db.link.driver}")
	private String dbDriver;
	@Value("${db.link.username}")
	private String dbUsername;
	@Value("${db.link.password}")
	private String dbPassword;


	@Override
	public String toString() {
		return "User{" +
				"intPort=" + intPort +
				", stringPort='" + stringPort + '\'' +
				", dbUrl='" + dbUrl + '\'' +
				", dbDriver='" + dbDriver + '\'' +
				", dbUsername='" + dbUsername + '\'' +
				", dbPassword='" + dbPassword + '\'' +
				'}';
	}
}
