package com.assignments.springmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.springmvc.model.Subject;
import com.assignments.springmvc.repository.SubjectRepository;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectRepository subjectRepository;

	@Transactional
	public Subject findById(Long id) {
		return subjectRepository.findById(id).orElse(null);
	}

	@Transactional
	public void saveOrUpdate(Subject subject) {
		subjectRepository.save(subject);
	}

	@Transactional
	public void delete(Subject subject) {
		subjectRepository.delete(subject);
	}
}