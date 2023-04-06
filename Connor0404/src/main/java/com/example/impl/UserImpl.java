package com.example.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.UserModel;
import com.example.service.UserService;


@Service
public class UserImpl implements UserService {
	
	@Resource
	private UserMapper mapper;

	@Override
	public Object insert(UserModel userModel) {
		return mapper.insert(userModel);
	}

	@Override
	public UserModel checkAccount(UserModel userModel) {
		return mapper.checkAccount(userModel);
	}

	@Override
	public List<UserModel> takeData(UserModel userModel) {
		
		return mapper.takeData(userModel);
	}
	

}