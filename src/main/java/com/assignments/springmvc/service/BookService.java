package com.assignments.springmvc.service;

import com.assignments.springmvc.model.Book;

public interface BookService {

	Book findById(Long id);
	
	void saveOrUpdate(Book book);
	
	void delete(Book book);
}
