package com.github.robertlatocha.bookcatalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.robertlatocha.bookcatalog.model.Book;
import com.github.robertlatocha.bookcatalog.reposiotry.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		bookRepository.findAll()
		.forEach(books::add);
		return books;
	}
	
	public Book getBookById(Long id) {
		return bookRepository.findOne(id);
		
	}
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public void updateBook(Long id, Book book) {
		bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepository.delete(id);
	}
}
