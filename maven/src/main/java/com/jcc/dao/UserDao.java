/**
 * @Description: 
 * @maven.com.jcc.dao
 * @FileName:UserDao.java
 * @Created By:景长超
 * @Created:2017年4月10日 下午10:13:33
 */
package com.jcc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jcc.po.User;

/**
 * @Description
 * @ClassName UserDao
 * @author 景长超
 * @Created 2017 2017年4月10日 下午10:13:33
 */
public interface UserDao {
	List<User> selectAllUser();
	User selectByusernameAndpassword(@Param("username")String username,@Param("password")String password);
}
