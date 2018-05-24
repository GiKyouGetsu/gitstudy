package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.AgentInfo;

public interface AvAgentRespository extends JpaRepository<AgentInfo, Integer> {

	// 通过Crm usr来查询
	public AgentInfo findBycUserName(String username);
}
