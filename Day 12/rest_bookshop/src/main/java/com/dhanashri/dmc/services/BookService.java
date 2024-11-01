package com.dhanashri.dmc.services;

import java.util.List;

import com.dhanashri.dmc.entities.Book;

public interface BookService {

	List<String> getAllSubjects();

	List<Book> getAllBookList();

	Book getBookById(int id);

	int deleteBookById(int id);

	int updateBook(Book bk);

}
