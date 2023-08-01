package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class StudentController {

	@Autowired
	StudentRepo stuRepo;
	
	@PostMapping("/stu/add")
	public String addStudent(@RequestBody Student stu) {
		
		System.out.println("Student name.."+stu.getName());
		stuRepo.save(stu);
		
		return "Successfully Added new Student";
	}
}
