package com.bookStore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	private boolean isAvailable;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String author, double price, boolean isAvailable) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	

}
