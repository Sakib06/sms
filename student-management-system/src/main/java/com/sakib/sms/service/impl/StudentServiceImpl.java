package com.sakib.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sakib.sms.entity.Student;
import com.sakib.sms.repository.StudentRepository;
import com.sakib.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
