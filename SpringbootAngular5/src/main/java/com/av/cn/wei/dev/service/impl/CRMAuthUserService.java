package com.av.cn.wei.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.av.cn.wei.dev.domain.CrmRepository;
import com.av.cn.wei.dev.pojo.CRMUserInfo;

public class CRMAuthUserService implements UserDetailsService {

	@Autowired
	private CrmRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		CRMUserInfo user = repository.findBycUserName(arg0);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
	}

    public boolean validate(CRMUserInfo user) {
    	CRMUserInfo entity = repository.findBycUserNameAndCPassword(user.getcUserName(), user.getcPassword());
        if (entity != null) {
            return true;
        }
        return false;
    }
}
