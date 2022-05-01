package com.example.biblioteca.demo.resources;


import java.util.List;

import com.example.biblioteca.demo.models.NewsModel;
import com.example.biblioteca.demo.services.NewsService;

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

@RestController
@RequestMapping("/news")
@CrossOrigin("*")
public class NewsController {
    
    @Autowired
    private NewsService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<NewsModel> findById(@PathVariable Long id){
        NewsModel newsModel = service.findById(id);
        return ResponseEntity.ok().body(newsModel);
    }

    @GetMapping
    public ResponseEntity<List<NewsModel>> findAll(){
        List<NewsModel> AutorModels = service.findAll();
        return ResponseEntity.ok().body(AutorModels);
    }

    @PostMapping
    public ResponseEntity<NewsModel> save(@RequestBody NewsModel AutorModel){
        NewsModel obj = service.save(AutorModel);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}