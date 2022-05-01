package com.example.biblioteca.demo.repositories;

import com.example.biblioteca.demo.models.AuthorModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
    
}
