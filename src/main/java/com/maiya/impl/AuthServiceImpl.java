package com.maiya.impl;

import com.maiya.bean.Auth;
import com.maiya.dao.AuthMapper;
import com.maiya.service.AuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("authTblService")
public class AuthServiceImpl implements AuthService {
	@Resource 
	private AuthMapper dao;
	
	public int insert(Auth record) {
		return dao.insert(record);
	}

	public Auth selectByToken(String token) {
		return dao.selectByToken(token);
	}

//	public Auth selectAppUserByToken(String token) {
//		return dao.selectAppUserByToken(token);
//	}
}
