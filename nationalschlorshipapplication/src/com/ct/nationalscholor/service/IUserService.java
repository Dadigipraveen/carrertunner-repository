package com.ct.nationalscholor.service;

import com.ct.nsa.entity.User;

public interface IUserService {
User login(User user);
	
	User logout(User user);

}
