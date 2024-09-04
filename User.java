package com.UserStructure.entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(schema = "usm", name = "umst_system_user_mst")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "gnum_sys_user_id")
    private Long id;

    @Column(name = "gstr_sys_login_id")
    private String loginId;

   @Column(name = "gstr_sys_user_name")
    private String username;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	}
