package com.av.cn.wei.dev.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.av.cn.wei.dev.domain.AvAgentRespository;
import com.av.cn.wei.dev.domain.CrmRepository;
import com.av.cn.wei.dev.pojo.AgentInfo;
import com.av.cn.wei.dev.pojo.CRMUserInfo;

@Service
public class CrmServiceImpl {
	
	@Autowired
	private CrmRepository cRepositoryrm;
	@Autowired
	private AvAgentRespository avAgentRespository;
	
	@Transactional
	public void addCrmAndAgentUser(CRMUserInfo crmUserInfo) {
		
		AgentInfo agentInfo = new AgentInfo();
		
		agentInfo.setcUserName(crmUserInfo.getcUserName());
		agentInfo.setAvayaAgentUsr("dlagent1@aps.avaya.com");
		agentInfo.setAvayaAgentPassword("Avaya123");
		
		this.cRepositoryrm.save(crmUserInfo);
		this.avAgentRespository.save(agentInfo);
		
	}
	
	@Transactional
	public CRMUserInfo validateLogin(CRMUserInfo crmUserInfo) {
		return this.cRepositoryrm.findBycUserNameAndCPassword(crmUserInfo.getcUserName(), crmUserInfo.getcPassword());
	}
	
	

}
