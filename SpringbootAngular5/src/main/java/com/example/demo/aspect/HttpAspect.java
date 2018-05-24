package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect { 
	
	
	private final static Logger LOG = LoggerFactory.getLogger(HttpAspect.class);
	@Pointcut("execution(public * com.example.demo.controller.GirlController.*(..))")
	public void log() {
		
	}

	@Before("log()")
	public void logBefore() {
	
		LOG.info("1111111");
	}
	
	@After("log()")
	public void doAfterLog() {
		LOG.info("2222222");
	}

}
