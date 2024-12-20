package com.dhanashri.interfaces;

import java.util.List;

import com.dhanashri.entities.Book;

public interface BookDaoable {
	public int save(Book bk);
	public int update(Book bk);
	public List<Book> findAll();
	public int deleteById(int id);
	public Book findById(int id);
	public List<Book> findBySubject(String subject);
	public List<String> findAllSubjects();
}
