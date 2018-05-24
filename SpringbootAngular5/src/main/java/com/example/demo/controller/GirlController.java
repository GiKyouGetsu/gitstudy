package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.aspect.HttpAspect;
import com.example.demo.domain.GirlRepository;
import com.example.demo.pojo.Girl;
import com.example.demo.service.impl.GirlServiceImpl;

@RestController()
@RequestMapping("/girl")
public class GirlController {
	
	private final static Logger LOG = LoggerFactory.getLogger(HttpAspect.class);

	@Autowired
	private GirlRepository girlRepository;
	
	
	@Autowired
	private GirlServiceImpl girlServiceImpl;
	
	/**
	 * 
	 * 查询 all girls
	 * @return
	 */
	@GetMapping(value = {"/getall"})
	public List<Girl> getGriList() {
		
		LOG.info("get all girls");
		return girlRepository.findAll();
	}
	
	/*
	 * 
	 * 添加一个girl
	 */
	@PostMapping("/addgirl")
	public Girl addGirl(@RequestParam("cupSize") String cupsize, @RequestParam("age") Integer age) {
		
		Girl girl = new Girl();
		girl.setCupSizeString(cupsize);
		girl.setAge(age);
		
		return girlRepository.save(girl);
	}
	
	
	
	
	/*
	 * 
	 * 查询一个girl
	 */
	@GetMapping("findgirl/{id}")
	public Girl findGirl(@PathVariable("id") Integer id) {
		
		return girlRepository.findOne(id);
	}

	/*
	 * 
	 * 查询一个girl 通过年龄
	 */
	@GetMapping("findgirlbyage/{age}")
	public List<Girl> findGirlbyAge(@PathVariable("age") Integer age) {
		
		return girlRepository.findByAge(age);
	}
	
	/*
	 * 
	 * update一个girl
	 */
	@PutMapping("updategirl/{id}")
	public Girl updateGirl(@PathVariable("id") Integer id
			,@RequestParam("cupSize") String cupsize, @RequestParam("age") Integer age) {
		Girl girl = new Girl();
		girl.setAge(age);
		girl.setCupSizeString(cupsize);
		girl.setId(id);
		
	return girlRepository.save(girl);
	}
	
	/*
	 * 
	 * delete一个girl
	 */
	@DeleteMapping("delgirl/{id}")
	public void deleteGirl(@PathVariable("id") Integer id) {
		
		girlRepository.delete(id);
	}
	
	/*
	 * 
	 * 添加一个girl
	 */
	@PostMapping("/addtwo")
	public void addGirlTwo() {
		girlServiceImpl.intsertTwo();

	}
	
}

