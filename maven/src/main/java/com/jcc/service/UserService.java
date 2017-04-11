/**
 * @Description: 
 * @maven.com.jcc.service
 * @FileName:UserService.java
 * @Created By:景长超
 * @Created:2017年4月10日 下午10:15:06
 */
package com.jcc.service;

import java.util.List;

import com.jcc.po.User;

/**
 * @Description
 * @ClassName UserService
 * @author 景长超
 * @Created 2017 2017年4月10日 下午10:15:06
 */
public interface UserService {
	List<User> selectAllUser();
	User selectByusernameAndpassword(String username,String password);
}
