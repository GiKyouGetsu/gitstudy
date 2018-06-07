package com.av.cn.wei.dev.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Girl {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String cupSizeString;
	
	private Integer age;
	
	public Girl() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCupSizeString() {
		return cupSizeString;
	}

	public void setCupSizeString(String cupSizeString) {
		this.cupSizeString = cupSizeString;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
}
