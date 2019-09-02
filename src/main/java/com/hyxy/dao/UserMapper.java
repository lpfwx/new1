package com.hyxy.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hyxy.entity.User;

public interface UserMapper {
	public List<User> selectuserinfo();
	public void insert(User user);
}
