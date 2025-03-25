package com.course.dao;

import java.util.List;

import com.course.entity.User;

public interface UserDao {
	
	//JAVA DOC
	/**
	 * 
	 * @return
	 */
	public List<User> findAll();
	
	// 透過UserName取得使用者
	public User findByUsername(String Username);
	
	public User findByUsernameandPassword(String Username,String Password);
	
	public User findById(Integer id);
	
	/**
	 * 新增使用者
	 * @param username
	 * @param password
	 */
	public void addUser(User user);
	
	public void delUser(User user);
	
	public void updateUser(User user);
}
