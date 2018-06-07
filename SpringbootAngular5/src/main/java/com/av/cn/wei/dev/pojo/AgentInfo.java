package com.av.cn.wei.dev.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames= {"id","avayaAgentUsr"})})
public class AgentInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String cUserName;
	
	private String avayaAgentUsr;
	
	private String avayaAgentPassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getcUserName() {
		return cUserName;
	}

	public void setcUserName(String cUserName) {
		this.cUserName = cUserName;
	}

	public String getAvayaAgentUsr() {
		return avayaAgentUsr;
	}

	public void setAvayaAgentUsr(String avayaAgentUsr) {
		this.avayaAgentUsr = avayaAgentUsr;
	}

	public String getAvayaAgentPassword() {
		return avayaAgentPassword;
	}

	public void setAvayaAgentPassword(String avayaAgentPassword) {
		this.avayaAgentPassword = avayaAgentPassword;
	}
	
	

}
