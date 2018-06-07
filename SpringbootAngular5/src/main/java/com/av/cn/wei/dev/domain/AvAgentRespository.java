package com.av.cn.wei.dev.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av.cn.wei.dev.pojo.AgentInfo;

public interface AvAgentRespository extends JpaRepository<AgentInfo, Integer> {

	// 通过Crm usr来查询
	public AgentInfo findBycUserName(String username);
}
