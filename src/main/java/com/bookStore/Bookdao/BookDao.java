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
	
	public Book addBook(Book book) {
		Session session = sf.openSession();
		session.save(book);
		session.beginTransaction().commit();
		return book;
	}
	
	public List<Book> getAllBooks(){
		Session session = sf.openSession();
		List<Book> book = session.createQuery("from Book", Book.class).list();
		return book;
	}
	

}
