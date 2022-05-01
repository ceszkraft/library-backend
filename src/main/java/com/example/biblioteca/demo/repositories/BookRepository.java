package com.example.biblioteca.demo.repositories;

import com.example.biblioteca.demo.models.BookModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long> {
    
}
