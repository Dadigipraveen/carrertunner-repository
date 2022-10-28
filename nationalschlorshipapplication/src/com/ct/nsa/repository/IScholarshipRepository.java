package com.ct.nsa.repository;

import java.util.List;

import com.ct.nsa.entity.Scholarship;

public interface IScholarshipRepository {
	Scholarship statusUpdate(Scholarship scholarship);

	List<Scholarship> fetchAllScholarships();

}
