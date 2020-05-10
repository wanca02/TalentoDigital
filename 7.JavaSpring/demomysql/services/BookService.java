package com.web.demo.mysql.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.demo.mysql.models.Book;
import com.web.demo.mysql.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	
//Devolviendo todos los libros.
  public List<Book> allBooks() {
      return bookRepository.findAll();
  }
  //Creando un libro.
  public Book createBook(Book b) {
      return bookRepository.save(b);
  }
  //Obteniendo la información de un libro
  public Book findBook(Long id) {
      Optional<Book> optionalBook = bookRepository.findById(id);
      if(optionalBook.isPresent()) {
          return optionalBook.get();
      } else {
          return null;
      }
  }

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		// TODO Auto-generated method stub
		Book b = findBook(id);
		if(!b.getTitle().equals(title) && !title.equals("")) b.setTitle(title);
		if(!b.getDescription().equals(desc) && !desc.equals("")) b.setDescription(desc);
		if(!b.getLanguage().equals(lang) && !lang.equals("")) b.setLanguage(lang);
		if(!b.getNumberOfPages().equals(numOfPages) && !numOfPages.equals(null)) b.setNumberOfPages(numOfPages);
		bookRepository.save(b);
		return b;
	}

	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}
}



