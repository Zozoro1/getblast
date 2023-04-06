package com.example.service;

import java.util.List;

import com.example.model.UserModel;

public interface UserService {
	public Object insert(UserModel userModel);
	public UserModel checkAccount(UserModel userModel);
	   public List<UserModel> takeData(UserModel userModel);
}
