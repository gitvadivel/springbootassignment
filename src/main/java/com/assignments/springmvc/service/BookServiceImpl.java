package com.assignments.springmvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.springmvc.model.Book;
import com.assignments.springmvc.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Transactional
	public Book findById(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Transactional
	public void saveOrUpdate(Book book) {
		bookRepository.save(book);
	}

	@Transactional
	public void delete(Book book) {
		bookRepository.delete(book);
	}
}