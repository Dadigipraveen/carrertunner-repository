package com.ct.nsa.repository;

import java.util.List;

import com.ct.nsa.entity.Officer;

public interface Iofficerrepository {
Officer saveOfficer(Officer officer);
	
	Officer updateOfficer(Officer officer);
	
	Officer fetchOfficerByState(String state);
	
	List<Officer> fetchAllOfficers();

}
