package com.example.demo.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Girl;

public interface GirlRepository  extends JpaRepository<Girl, Integer>{

	// 通过年龄来查询
	public List<Girl> findByAge(Integer age);
}
