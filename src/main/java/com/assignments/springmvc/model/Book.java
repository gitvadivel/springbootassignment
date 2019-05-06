package com.assignments.springmvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "book", schema = "fsd")
public class Book implements Serializable {
	@Id
	@Column(name = "book_id")
	private long bookId;
	@Column(name = "title")
	private String title;
	@Column(name = "price")
	private double price;
	@Column(name = "volume")
	private int volume;
	@Column(name = "publish_date")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private java.util.Date publishDate;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	public Book() {
	}

	public Book(long bookId, String title, double price, int volume,
			java.util.Date publishDate, Subject subject) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.volume = volume;
		this.publishDate = publishDate;
		this.subject = subject;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public java.util.Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(java.util.Date publishDate) {
		this.publishDate = publishDate;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}
