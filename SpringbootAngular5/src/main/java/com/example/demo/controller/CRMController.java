package com.example.demo.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.CRMUserInfo;
import com.example.demo.service.impl.CrmServiceImpl;

@RestController
@RequestMapping("/crm")
public class CRMController {
	
	@Autowired
	private CrmServiceImpl crmServiceImpl;
	
	private final static Logger LOG = LoggerFactory.getLogger(CRMController.class);
	
	 @GetMapping("/user")
	    @ResponseBody
	    public Principal user(Principal user) {
	        return user;
	    }
	/*
	 * 
	 * 添加一个User
	 */
	@PostMapping(path="/addCrmusr")
	public void addCrmUser(@RequestBody CRMUserInfo crmUserInfo) {
		
		this.crmServiceImpl.addCrmAndAgentUser(crmUserInfo);

	}
	
	/*
	 * 
	 * login check
	 */
	@PostMapping(path="/cklogin")
	public String crmLogin(@RequestBody CRMUserInfo crmUserInfo) {
		
		LOG.info("UserName: " + crmUserInfo.getcUserName() + " " + "Password: " + crmUserInfo.getcPassword());
		
		crmUserInfo.setcUserName(crmUserInfo.getcUserName());
		crmUserInfo.setcPassword(crmUserInfo.getcPassword());
		return this.crmServiceImpl.validateLogin(crmUserInfo) != null ? "ok" : "notOk";
	}
}
