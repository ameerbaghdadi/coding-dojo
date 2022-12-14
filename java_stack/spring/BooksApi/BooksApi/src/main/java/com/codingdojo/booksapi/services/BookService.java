package com.codingdojo.booksapi.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.booksapi.models.Book;
import com.codingdojo.booksapi.repositories.BookRepository;
@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
     Optional<Book> bookUp = bookRepository.findById(id);
     if(bookUp.isPresent()) {
    	 Book updateBook = bookUp.get();
    	 updateBook.setTitle(title);
    	 updateBook.setDescription(desc);
    	 updateBook.setLanguage(lang);
    	 updateBook.setNumberOfPages(numOfPages);
    	 
    	 return bookRepository.save(updateBook);
    	 
     } else {
    	 
         return null;
     }
     
 }
 public void deleteBook(Long id) {
	 
    	 bookRepository.deleteById(id);   
 }
}

