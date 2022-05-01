package com.example.biblioteca.demo.repositories;


import com.example.biblioteca.demo.models.NewsModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsModel, Long>{    
}
