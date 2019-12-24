package com.xiaohai24.service;

import java.sql.SQLException;

import com.xiaohai24.dao.loginDao;
import com.xiaohai24.domain.User;

public class loginService {

	public User chenkLingon(String username, String password) throws SQLException {
	
		loginDao dao = new loginDao();
		return dao.chenkLingon(username,password);
	
	
	}

}
