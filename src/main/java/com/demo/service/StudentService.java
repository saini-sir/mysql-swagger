package com.demo.service;

import java.util.List;

import com.demo.modal.Student;

public interface StudentService {
	List<Student> allStudent();
	Student addStudent (Student student);

}
