package com.ct.nationalscholor.service;

import java.util.List;

import com.ct.nsa.entity.Student;
import com.ct.nsa.exception.InvalidInstitutionException;

public interface IStudentService {
Student addStudent(Student student);
	
	Student editStudent(Student student);
	
	List<Student> getAllStudents();
	
	List<Student> getStudentsByInstitute(String name) throws InvalidInstitutionException;

}
