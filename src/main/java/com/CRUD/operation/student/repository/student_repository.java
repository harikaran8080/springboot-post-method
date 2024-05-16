package com.CRUD.operation.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.operation.student.entity.Students;

public interface student_repository  extends JpaRepository<Students, Integer>{

}
