package com.course.dao;

import com.course.entity.User;

public interface UserDao {
	public User findByUsername(String Username);
	
	public void addUser(String username,String password);
}
