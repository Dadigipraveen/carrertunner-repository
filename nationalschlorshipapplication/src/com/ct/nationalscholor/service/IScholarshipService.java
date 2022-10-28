package com.ct.nationalscholor.service;

import java.util.List;

import com.ct.nsa.entity.Scholarship;

public interface IScholarshipService {
	Scholarship statusUpdate(Scholarship scholarship);

	List<Scholarship> getAllScholarships();

}
