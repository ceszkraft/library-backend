package com.example.biblioteca.demo.resources;

import java.util.List;

import com.example.biblioteca.demo.models.AuthorModel;
import com.example.biblioteca.demo.services.AuthorService;

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

@RequestMapping("/authors")
@RestController
@CrossOrigin(origins = "*")
public class AuthorController {
    
    @Autowired
    private AuthorService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<AuthorModel> findById(@PathVariable Long id){
        AuthorModel AuthorModel = service.findById(id);
        return ResponseEntity.ok().body(AuthorModel);
    }

    @GetMapping
    public ResponseEntity<List<AuthorModel>> findAll(){
        List<AuthorModel> AutorModels = service.findAll();
        return ResponseEntity.ok().body(AutorModels);
    }

    @PostMapping
    public ResponseEntity<AuthorModel> save(@RequestBody AuthorModel AutorModel){
        AuthorModel obj = service.save(AutorModel);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
