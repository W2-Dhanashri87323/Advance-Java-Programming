package com.dhanashri.beans;

import java.util.ArrayList;
import java.util.List;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;

public class BooksBean {
	private String subject;
	private List<Book> books;
	 
	public BooksBean() {
		this.books = new ArrayList<Book>();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		System.out.println(subject);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void findBooks() {
		try(BookDao dao = new BookDao()) {
	     	this.books = dao.findBySubject(this.subject);	
	     	for (Book book : books) {
			System.out.println(book);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
