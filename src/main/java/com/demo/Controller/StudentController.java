package com.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.demo.modal.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {
// http://localhost:8080/swagger-ui/index.html
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> findAllStudent(){
		return studentService.allStudent();
	}
	
	@PostMapping("/add")
	public Student addStudent (@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
}
