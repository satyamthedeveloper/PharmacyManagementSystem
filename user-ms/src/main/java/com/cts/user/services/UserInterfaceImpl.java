package com.cts.user.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.user.dao.UserDao;

public class UserInterfaceImpl implements UserInterface{
	
	@Autowired 
	private UserDao userDao;
}
