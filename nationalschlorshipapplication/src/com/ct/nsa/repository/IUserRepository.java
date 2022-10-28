package com.ct.nsa.repository;

import com.ct.nsa.entity.User;

public interface IUserRepository {
User login(User user);
	
	User logout(User user);

}
