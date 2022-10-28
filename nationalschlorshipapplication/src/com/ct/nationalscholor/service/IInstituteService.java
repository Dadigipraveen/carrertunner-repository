package com.ct.nationalscholor.service;

import java.util.List;

import com.ct.nsa.entity.Institution;
import com.ct.nsa.exception.InvalidInstitutionException;

public interface IInstituteService {

	Institution addInstitute(Institution institute);
	
	Institution editInstitute(Institution institute);
	
	Institution statusUpdate(Institution institute);
	
	Institution getInstitute(int code) throws InvalidInstitutionException;
	
	List<Institution> getAllInstitutes();
	
	List<Institution> getInstitutesByState(String state);

}
