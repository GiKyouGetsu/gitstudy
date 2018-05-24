package com.example.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.CRMUserInfo;

public interface CrmRepository extends JpaRepository<CRMUserInfo, Integer> {

	public CRMUserInfo findBycUserNameAndCPassword(String cUserName, String cPassword);

	public CRMUserInfo findBycUserName(String cUserName);
}
