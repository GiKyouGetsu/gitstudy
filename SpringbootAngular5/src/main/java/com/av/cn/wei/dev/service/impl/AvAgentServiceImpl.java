package com.av.cn.wei.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.av.cn.wei.dev.domain.AvAgentRespository;
import com.av.cn.wei.dev.pojo.AgentInfo;

@Service
public class AvAgentServiceImpl {
	
	@Autowired
	private AvAgentRespository avAgentRespository;
	
//	@Transactional
//	public void intsertTwo() {
//		Girl girlA = new Girl();
//		girlA.setAge(19);
//		girlA.setCupSizeString("G");
//		girlRepository.save(girlA);
//		
//		
//		Girl girlB = new Girl();
//		girlB.setAge(20);
//		girlB.setCupSizeString("Ccc");
//		girlRepository.save(girlB);
//	}
	
	public AgentInfo findAgentUsr(String usr) {
		
		return this.avAgentRespository.findBycUserName(usr);
		
	}

}
