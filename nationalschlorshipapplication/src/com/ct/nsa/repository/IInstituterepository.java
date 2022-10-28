package com.ct.nsa.repository;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.ct.nsa.entity.Institution;

public interface IInstituterepository {
Institution saveInstitute(Institution institute);
	
	Institution updateInstitute(Institution institute);
	
	Institution statusUpdate(Institution institute);
	
	Institution fetchInstitute(int code) throws ExecutionException;
	
	List<Institution> fetchAllInstitutes();
	
	List<Institution> fetchInstitutesByState(String state);

}
