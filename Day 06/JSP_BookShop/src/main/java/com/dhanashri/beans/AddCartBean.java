package com.dhanashri.beans;

import java.util.ArrayList;
import java.util.List;

import com.dhanashri.daos.BookDao;
import com.dhanashri.entities.Book;

public class AddCartBean {
	private String[] bookIds;
	private List<Book> bookList;

	public AddCartBean() {
		bookList = new ArrayList<>();
	}

	public String[] getBookIds() {
		return bookIds;
	}

	public void setBookIds(String[] bookIds) {
		this.bookIds = bookIds;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public void addToCart() {
		try (BookDao dao = new BookDao()) {
			for (String bookId : bookIds) {
				int id = Integer.parseInt(bookId);
				Book book = dao.findById(id);
				this.bookList.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
