package com.dhanashri.beans;

import java.util.ArrayList;
import java.util.List;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;

public class BooksBean {
	private String subjects;
	private List<Book> books;
	 
	public BooksBean() {
		this.books = new ArrayList<Book>();
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void findBooks() {
		try(BookDao dao = new BookDao()) {
	     	this.books = dao.findBySubject(this.subjects);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
