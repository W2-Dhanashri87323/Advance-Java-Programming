package com.dhanashri.dmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhanashri.dmc.entities.Book;
import com.dhanashri.dmc.services.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class BookRestControllerV1 {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public @ResponseBody List<Book> getAllBooks(){
		 List<Book> list = bookService.getAllBookList();	
		return list;
	}
	
	@GetMapping("/books/{id}")
	public @ResponseBody Book getBookOfId(@PathVariable("id") int id) {
		try {
			Book bk = bookService.getBookById(id);
			return bk;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	@DeleteMapping("/books/{id}")
	public @ResponseBody String deleteBook(@PathVariable("id") int id) {
		String message = "";
		try {
			int count = bookService.deleteBookById(id);
			message = "Books Deleted : " + count;
			
		} catch (Exception e) {
			e.printStackTrace();
			message ="Book Delete Failed .";
		}
		return message;
	}
	
	@PutMapping("books/{id}")
	public @ResponseBody String updateBook(@PathVariable("id") int id, @RequestBody Book bk) {
		String message;
		bk.setId(id);
		try {
			int count = bookService.updateBook(bk);
			message = "Books Updated :" + count;
		} catch (Exception e) {
			e.printStackTrace();
			message = "Book Update Failed .";
		}
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
