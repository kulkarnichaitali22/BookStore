package com.bookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookStore.Bookservice.BookService;
import com.bookStore.Model.Book;

@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@PostMapping("api/addBook")
	public Book addBook(@RequestBody Book book)
	{
		return service.addBook(book);
	}

	@GetMapping("api/getAllBooks")
	public List<Book> getAllBooks()
	{
		return service.getAllBooks();
	}
	
	@GetMapping("api/getBookById/{bookId}")
	public Book getBookById(@PathVariable("bookId")long bookId)
	{
		return service.getBookById(bookId);
	}
	
	@PostMapping("api/updateBook")
	public Book updateBook(@RequestBody Book book)
	{
		return service.updateBook(book);
	}
	
	@DeleteMapping("api/deleteBookById/{bookId}")
	public void deleteBookById(@PathVariable ("bookId") long bookID )
	{
		service.deleteBook(bookID);
	}
}
