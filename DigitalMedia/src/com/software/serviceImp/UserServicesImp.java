package com.software.serviceImp;

import com.software.dao.UserDao;
import com.software.entity.User;
import com.software.service.UserServices;

public class UserServicesImp implements UserServices {
	private UserDao ud=new UserDao();
	@Override
	public User userLogin(long id) {
		User user =ud.login(id); 
		// TODO Auto-generated method stub
		return user;
	}
	
	
}
