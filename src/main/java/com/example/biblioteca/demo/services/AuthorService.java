package com.example.biblioteca.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.biblioteca.demo.models.AuthorModel;
import com.example.biblioteca.demo.repositories.AuthorRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    
    @Autowired
    private AuthorRepository repo;

    public AuthorModel findById(Long id){
        Optional<AuthorModel> prod = repo.findById(id);
        return prod.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado. Id: " + id + "Tipo: " + AuthorModel.class.getName(), null));
    }

    public List<AuthorModel> findAll(){
        return repo.findAll();
    }
    
    public AuthorModel save(AuthorModel AuthorModel){
        AuthorModel.setId(null);
        return repo.save(AuthorModel);
    }

    public void delete(Long id){
        repo.deleteById(id);



    }
}