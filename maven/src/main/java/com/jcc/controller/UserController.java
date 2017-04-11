/**
 * @Description: 
 * @maven.com.jcc.controller
 * @FileName:UserController.java
 * @Created By:景长超
 * @Created:2017年4月10日 下午10:17:36
 */
package com.jcc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jcc.po.User;
import com.jcc.service.UserService;

/**
 * @Description
 * @ClassName UserController
 * @author 景长超
 * @Created 2017 2017年4月10日 下午10:17:36
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login(){
		return "login";
	}
	@RequestMapping("index")
	public String index(HttpServletRequest request,String username,String password){
		User user = userService.selectByusernameAndpassword(username, password);
		if(null!=user){
			return "index";
		}else{
			return "login";
		}
	}
}
