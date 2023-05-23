package br.com.lauracezar.library.controller;

import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lauracezar.library.model.Book;
import br.com.lauracezar.library.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Book book) {
        try{
            return new ResponseEntity<>(service.save(book), HttpStatus.CREATED);
        } catch (IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            // Gerar um log com as informações do problema
            return new ResponseEntity<>("Lamento, house um erro inesperado em nossa aplicação.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Book book) {
        try {
            var result = service.findOne(book.getIsbn());
            if(result.isPresent()) {
                return new ResponseEntity<>(service.save(book), HttpStatus.CREATED);
            }
            return new ResponseEntity<>("O livro não foi localizado em nossa base de dados.", HttpStatus.NOT_FOUND);
        } catch(IllegalArgumentException iae) {
            return new ResponseEntity<>(iae.getMessage(), HttpStatus.BAD_REQUEST);
        } catch(Exception e) {
            // TODO Gerar um lod de sistema
            return new ResponseEntity<>("Houve um erro inesperado em nossa aplicação, tente novamente mais tarde.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
