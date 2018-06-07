package com.example.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.av.cn.wei.dev.controller.HelloWorldController;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration()
@WebAppConfiguration
public class HelloWorldControllerTest {

	private  MockMvc mvc;
	
	@Before
	public void setup() throws Exception {
		
		mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
			
	}
	
	@Test
	public void getHello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isNotFound())
			.andExpect(content().string(equalTo("")));
	} 
}
