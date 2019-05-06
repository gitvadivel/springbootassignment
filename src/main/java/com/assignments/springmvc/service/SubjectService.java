package com.assignments.springmvc.service;

import com.assignments.springmvc.model.Subject;

public interface SubjectService {

	Subject findById(Long id);

	void saveOrUpdate(Subject subject);

	void delete(Subject subject);
}
