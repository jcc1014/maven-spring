/**
 * @Description: 
 * @maven.com.jcc.service.impl
 * @FileName:UserServiceImpl.java
 * @Created By:鏅暱瓒�
 * @Created:2017骞�鏈�0鏃�涓嬪崍10:15:56
 */
package com.jcc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcc.dao.UserDao;
import com.jcc.po.User;
import com.jcc.service.UserService;

/**
 * @Description
 * @ClassName UserServiceImpl
 * @author 鏅暱瓒�
 * @Created 2017 2017骞�鏈�0鏃�涓嬪崍10:15:56
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public List<User> selectAllUser() {
		return userDao.selectAllUser();
	}

	public User selectByusernameAndpassword(String username, String password) {
		return userDao.selectByusernameAndpassword(username, password);
	}

}
