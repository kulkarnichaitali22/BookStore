package com.bookStore.Bookservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.Bookdao.BookDao;
import com.bookStore.Model.Book;

@Service
public class BookService {
	
	@Autowired
	BookDao dao;
	
	public Book addBook(Book book) 
	{
		return dao.addBook(book);
	}
	
	public List<Book> getAllBooks()
	{
		return dao.getAllBooks();
	}
	
	public Book getBookById(long bookId) 
	{
		return dao.getBookById(bookId);
	}
	
	public Book updateBook(Book book)
	{
		return dao.updateBook(book);
	}
	
	public void deleteBook(long bookId)
	{
		dao.deleteBookById(bookId);
	}

}
