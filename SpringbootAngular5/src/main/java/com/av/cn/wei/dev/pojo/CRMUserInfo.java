package com.av.cn.wei.dev.pojo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames= {"id","avayaAgentUsr"})})
public class CRMUserInfo implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String cUserName;
	
	private String cPassword;

    public CRMUserInfo() {
    }

    public CRMUserInfo(String username, String password) {
        this.cUserName = username;
        this.cPassword = password;
    }

    public CRMUserInfo(Long id, String username, String password) {
    	this.cUserName = username;
        this.cPassword = password;
    }
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getcUserName() {
		return cUserName;
	}

	public void setcUserName(String cUserName) {
		this.cUserName = cUserName;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
//		List<GrantedAuthority> auths = new ArrayList<>();
//        List<SysRole> roles = this.getRoles();
//        for (SysRole role : roles) {
//            auths.add(new SimpleGrantedAuthority(role.getName()));
//        }
//        return auths;
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.cPassword;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.cUserName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
