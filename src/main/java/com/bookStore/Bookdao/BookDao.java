package com.bookStore.Bookdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookStore.Model.Book;

@Repository
public class BookDao {
	
	@Autowired
	SessionFactory sf;
	
	public Book addBook(Book book)
	{
		Session session = sf.openSession();
		session.save(book);
		session.beginTransaction().commit();
		return book;
	}
	
	public List<Book> getAllBooks()
	{
		Session session = sf.openSession();
		List<Book> book = session.createQuery("from Book", Book.class).list();
		return book;
	}
	
	public Book getBookById(long bookId) 
	{
		Session session = sf.openSession();
		Book book = session.get(Book.class, bookId);
		session.save(book);
		session.beginTransaction().commit();
		return book;
	}
	
	public Book updateBook(Book book)
	{
		Session session = sf.openSession();
		session.update(book);
		session.beginTransaction().commit();
		return book;
	}
	
	public void deleteBookById(long bookId)
	{
		Session session = sf.openSession();
		Book book = session.get(Book.class, bookId);
		session.delete(book);
		session.beginTransaction().commit();
		
	}

}
