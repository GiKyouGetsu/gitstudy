package com.av.cn.wei.dev.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av.cn.wei.dev.pojo.CRMUserInfo;

public interface CrmRepository extends JpaRepository<CRMUserInfo, Integer> {

	public CRMUserInfo findBycUserNameAndCPassword(String cUserName, String cPassword);

	public CRMUserInfo findBycUserName(String cUserName);
}
