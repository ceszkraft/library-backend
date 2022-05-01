package com.example.biblioteca.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.biblioteca.demo.models.NewsModel;
import com.example.biblioteca.demo.repositories.NewsRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    @Autowired
    private NewsRepository repo;

    public NewsModel findById(Long id){
        Optional<NewsModel> prod = repo.findById(id);
        return prod.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado. Id: " + id + "Tipo: " + NewsModel.class.getName(), null));
    }

    public List<NewsModel> findAll(){
        return repo.findAll();
    }
    
    public NewsModel save(NewsModel NewsModel){
        NewsModel.setId(null);
        return repo.save(NewsModel);
    }

    public void delete(Long id){
        repo.deleteById(id);
    }

}