package com.hyxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hyxy.dao.UserMapper;
import com.hyxy.entity.User;
@Service
public class UserServiceImp implements UserService{
	@Resource
	UserMapper userMapper;
	@Override
	public List<User> selectAll() {
		List<User> list = userMapper.selectuserinfo();
		return list;
	}
	@Override
	public void insert(User user) {
		userMapper.insert(user);
		
	}
	
}
