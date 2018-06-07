package com.av.cn.wei.dev.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.av.cn.wei.dev.domain.GirlRepository;
import com.av.cn.wei.dev.pojo.Girl;

@Service
public class GirlServiceImpl {
	
	@Autowired
	private GirlRepository girlRepository;
	
	@Transactional
	public void intsertTwo() {
		Girl girlA = new Girl();
		girlA.setAge(19);
		girlA.setCupSizeString("G");
		girlRepository.save(girlA);
		
		
		Girl girlB = new Girl();
		girlB.setAge(20);
		girlB.setCupSizeString("Ccc");
		girlRepository.save(girlB);
	}

}
