package com.example.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "gril")
@Component
public class GrilProperties {

	private String girlname;
	
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGirlname() {
		return girlname;
	}

	public void setGirlname(String girlname) {
		this.girlname = girlname;
	}

}
