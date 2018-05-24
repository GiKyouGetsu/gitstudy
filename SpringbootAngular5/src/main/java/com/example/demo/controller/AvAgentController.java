package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.AgentInfo;
import com.example.demo.service.impl.AvAgentServiceImpl;

@RestController
@RequestMapping("/av")
public class AvAgentController {
	
	@Autowired
	private AvAgentServiceImpl avAgentServiceImpl;
	/*
	 * 
	 * update一个girl
	 */
//	@PutMapping("updusr/{id}")
//	public Girl updateGirl(@PathVariable("id") Integer id
//			,@RequestParam("cupSize") String cupsize, @RequestParam("age") Integer age) {
//		Girl girl = new Girl();
//		girl.setAge(age);
//		girl.setCupSizeString(cupsize);
//		girl.setId(id);
//		
//	return girlRepository.save(girl);
//	}
	
	/*
	 * 
	 * delete一个girl
	 */
//	@DeleteMapping("delgirl/{id}")
//	public void deleteGirl(@PathVariable("id") Integer id) {
//		
//		girlRepository.delete(id);
//	}
//	
	/*
	 * 
	 * 添加一个girl
	 */
//	@PostMapping("/addAvagent")
//	public void addAvagent() {
//		avAgentServiceImpl
//
//	}
	@GetMapping("/getAvAgent/{username}")
//	@Produce({ MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON })
	public Map<String , AgentInfo> findAvAgentUser(@PathVariable("username") String username) {
		
		Map<String, AgentInfo> rMap = new HashMap<>();
		rMap.put("username", avAgentServiceImpl.findAgentUsr(username));
		return rMap;
	}

}
