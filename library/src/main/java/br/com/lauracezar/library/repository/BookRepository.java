package br.com.lauracezar.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lauracezar.library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    public Optional<String> findByAuthor(String author);
}