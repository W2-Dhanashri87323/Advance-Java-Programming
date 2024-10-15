package com.dhanashri;

public class Book {
	private int id;
	private String name;
	private String subject;
	private String author;
	private double price;

	public Book() {

	}

	public Book(int id, String name, String subject, String author, double price) {
		
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", subject=" + subject + ", author=" + author + ", price=" + price
				+ "]";
	}
	
	

}
