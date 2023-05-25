package br.com.lauracezar.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lauracezar.library.model.Book;
import br.com.lauracezar.library.model.Validation;
import br.com.lauracezar.library.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book save(Book book) throws IllegalArgumentException {
        if(!Validation.titleValidation(book.getTitle())) {
            throw new IllegalArgumentException("O título do livro é inválido. O mesmo deve conter de 3 à 100 caracteres.");
        }
        // if(!Validation.nameValidation(book.getAuthor())) {
        //     throw new IllegalArgumentException("O nome do autor é inválido. O mesmo deve conter de 3 à 50 caracteres.");
        // }
        if(!Validation.nameValidation(book.getPublisher())) {
            throw new IllegalArgumentException("O nome da editora é inválido. O mesmo deve conter de 3 à 50 caracteres.");
        }
        return repository.save(book);
    }

    public Optional<Book> findOne(Long isbn) {
        return repository.findById(isbn);
    }

    public void delete(Long isbn) {
        repository.deleteById(isbn);
    }
}
