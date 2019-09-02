package com.hyxy.service;

import java.util.List;

import com.hyxy.entity.User;

public interface UserService {
	public List<User> selectAll();
	public void insert(User user);
}
