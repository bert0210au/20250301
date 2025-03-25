package com.course.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.dao.impl.UserDaoImpl;
import com.course.entity.User;
import com.course.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDaoImpl userDao;
	
	public boolean login(String Username,String Password) {
		
		User user=userDao.findByUsernameandPassword(Username,Password);
		
		if(user!=null) {
			//登入成功
			return true;
		}else {
			//登入失敗
			return false;
		}
		
		
	}
	
	public void addUser(String username, String password) {
		// 如果有邏輯的話，寫在這
		
		// Entity
		User user = new User(username, password);
		userDao.addUser(user);
	}
	
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	public User findById(Integer id) {
		return userDao.findById(id);
	}
	
	public void deleteByID(Integer id) {
		User user= findById(id);
		if(user != null) {
			userDao.delUser(user);
		}
		
	}
	
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	
	/**
	 * 更新使用者資料
	 * @param userVo
	 */
	public void updateUser(UserVo userVo) {
		User user = findByUsername(userVo.getUsername());

		// "", " "
		if (userVo.getPassword() != null && !userVo.getPassword().isBlank()) {
			user.setPassword(userVo.getPassword());
		}

		if (userVo.getEmail() != null && !userVo.getEmail().isBlank()) {
			user.setEmail(userVo.getEmail());
		}

		if (userVo.getBirthDay() != null && !userVo.getBirthDay().isBlank()) {
			user.setBirthDay(parseDate(userVo.getBirthDay()));
		}

		userDao.updateUser(user);
	}
	
	private Date parseDate(String dateStr) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatter.parse(dateStr);
			System.out.println("Parsed Date: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	
}
