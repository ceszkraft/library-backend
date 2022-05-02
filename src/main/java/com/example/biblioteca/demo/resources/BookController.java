package com.example.biblioteca.demo.resources;

import java.util.List;

import com.example.biblioteca.demo.models.BookModel;
import com.example.biblioteca.demo.services.BookService;
import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/books")
@RestController
@CrossOrigin(origins = "*")
public class BookController {
    
    @Autowired
    private BookService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<BookModel> findById(@PathVariable Long id){
        BookModel BookModel = service.findById(id);
        return ResponseEntity.ok().body(BookModel);
    }

    @GetMapping
    @JsonIgnore
    public ResponseEntity<List<BookModel>> findAll(){
        List<BookModel> AutorModels = service.findAll();
        return ResponseEntity.ok().body(AutorModels);
    }

    @PostMapping
    public ResponseEntity<BookModel> save(@RequestBody BookModel AutorModel){
        BookModel obj = service.save(AutorModel);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
