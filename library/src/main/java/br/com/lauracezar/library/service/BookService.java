package br.com.lauracezar.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lauracezar.library.model.Book;
import br.com.lauracezar.library.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book save(Book book) {
        return repository.save(book);
    }
}
