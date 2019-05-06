package com.assignments.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.springmvc.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
