package com.ct.nsa.repository;

import java.util.List;

import com.ct.nsa.entity.Student;
import com.ct.nsa.exception.InvalidInstitutionException;

public interface IStudentRepository {
Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	List<Student> fetchAllStudents();
	
	List<Student> fetchStudentsByInstitute(String name) throws InvalidInstitutionException;

}
