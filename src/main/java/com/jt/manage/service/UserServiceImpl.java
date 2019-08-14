package com.jt.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.manage.mapper.UserMapper;
import com.jt.manage.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired UserMapper userMapper;
	
	public List<User> findAll() {
		System.out.println("service");
		return userMapper.findAll();
	}
	
}
