package com.example.biblioteca.demo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="tb_news")
@Data @AllArgsConstructor @NoArgsConstructor
public class NewsModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String url;
    
    @Column(nullable = true)
    private String alt;
    
    @Column(name = "titulo" , nullable = false, length = 50)
    private String title;
    
    @Column(name = "descricao", nullable = false, length = 10000)
    private String description;

    
}
