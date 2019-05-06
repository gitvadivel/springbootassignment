package com.assignments.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assignments.springmvc.model.Book;
import com.assignments.springmvc.model.Subject;
import com.assignments.springmvc.service.BookService;
import com.assignments.springmvc.service.SubjectService;

@Controller
@RequestMapping("/")
public class SubjectSpringDataController {

	@Autowired
	private Subject subject;

	@Autowired
	private Book book;

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private BookService bookService;

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		return "welcome";
	}

	@RequestMapping(value = "/addSubject", method = RequestMethod.GET)
	public String addSubject(Model model) {
		model.addAttribute("subjectObj", subject);
		return "addSubject";
	}

	@RequestMapping(value = "/addSubject", method = RequestMethod.POST)
	public String addSubject(@ModelAttribute("subjectObj") Subject subject, ModelMap model) {
		subjectService.saveOrUpdate(subject);
		model.addAttribute("status", "Subject successfully added");
		return "welcome";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public String addBook(Model model) {
		model.addAttribute("bookObj", book);
		return "addBook";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("bookObj") Book book, ModelMap model) {
		bookService.saveOrUpdate(book);
		model.addAttribute("status", "Book successfully added");
		return "welcome";
	}

	@RequestMapping(value = "/deleteBook", method = RequestMethod.GET)
	public String deleteBook(Model model) {
		model.addAttribute("bookObj", book);
		return "deleteBook";
	}

	@RequestMapping(value = "/deleteBook", method = RequestMethod.POST)
	public String deleteBook(@ModelAttribute("bookObj") Book book, ModelMap model) {
		if (bookService.findById(book.getBookId()) != null) {
			bookService.delete(book);
			model.addAttribute("status", "Book successfully deleted with id: " + book.getBookId());
			return "welcome";
		} else {
			return "resourceNotFound";
		}
	}

	@RequestMapping(value = "/deleteSubject", method = RequestMethod.GET)
	public String deleteSubject(Model model) {
		model.addAttribute("subjectObj", subject);
		return "deleteSubject";
	}

	@RequestMapping(value = "/deleteSubject", method = RequestMethod.POST)
	public String deleteSubject(@ModelAttribute("subjectObj") Subject subject, ModelMap model) {
		if (subjectService.findById(subject.getSubjectId()) != null) {
			subjectService.delete(subject);
			model.addAttribute("status", "Subject successfully deleted with id: " + subject.getSubjectId());
			return "welcome";
		} else {
			return "resourceNotFound";
		}

	}

	@RequestMapping(value = "/searchBook", method = RequestMethod.GET)
	public String searchBook(Model model) {
		model.addAttribute("bookObj", book);
		return "searchBook";
	}

	@RequestMapping(value = "/searchBook", method = RequestMethod.POST)
	public String searchBook(@ModelAttribute("bookObj") Book book, ModelMap model) {
		Book bookRecord = bookService.findById(book.getBookId());
		if (bookRecord != null) {
			model.addAttribute("bookObj", bookRecord);
			return "viewBook";
		} else {
			return "resourceNotFound";
		}
	}

	@RequestMapping(value = "/searchSubject", method = RequestMethod.GET)
	public String searchSubject(Model model) {
		model.addAttribute("subjectObj", subject);
		return "searchSubject";
	}

	@RequestMapping(value = "/searchSubject", method = RequestMethod.POST)
	public String searchSubject(@ModelAttribute("subjectObj") Subject subject, ModelMap model) {
		Subject subjectRecord = subjectService.findById(subject.getSubjectId());
		if (subjectRecord != null) {
			model.addAttribute("subjectObj", subjectRecord);
			return "viewSubject";
		} else {
			return "resourceNotFound";
		}

	}

}