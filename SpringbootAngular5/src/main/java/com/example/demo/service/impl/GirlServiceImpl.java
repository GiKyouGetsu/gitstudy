package com.example.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.GirlRepository;
import com.example.demo.pojo.Girl;

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
