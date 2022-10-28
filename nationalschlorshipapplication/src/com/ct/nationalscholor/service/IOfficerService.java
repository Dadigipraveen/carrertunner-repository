package com.ct.nationalscholor.service;

import java.util.List;

import com.ct.nsa.entity.Officer;

public interface IOfficerService {
Officer addOfficer(Officer officer);
	
	Officer editOfficer(Officer officer);
	
	Officer getOfficerByState(String state);
	
	List<Officer> getAllOfficers();

}
