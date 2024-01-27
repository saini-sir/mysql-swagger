package com.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.StudentRepository;
import com.demo.modal.Student;
import com.demo.service.StudentService;

@Service
public class StudentImpl implements  StudentService  {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> allStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

}
