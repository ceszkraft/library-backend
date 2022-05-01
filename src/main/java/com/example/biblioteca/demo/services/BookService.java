package com.example.biblioteca.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.biblioteca.demo.models.BookModel;
import com.example.biblioteca.demo.repositories.BookRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository repo;

    public BookModel findById(Long id){
        Optional<BookModel> prod = repo.findById(id);
        return prod.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado. Id: " + id + "Tipo: " + BookModel.class.getName(), null));
    }

    public List<BookModel> findAll(){
        return repo.findAll();
    }
    
    public BookModel save(BookModel BookModel){
        BookModel.setId(null);
        return repo.save(BookModel);
    }

    public void delete(Long id){
        repo.deleteById(id);



    }
    
}
