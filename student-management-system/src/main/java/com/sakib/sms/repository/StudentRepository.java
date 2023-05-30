package com.sakib.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakib.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
