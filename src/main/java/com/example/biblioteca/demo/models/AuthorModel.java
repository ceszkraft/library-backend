package com.example.biblioteca.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_autores")
@Data
public class AuthorModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", nullable = false, length = 255)
    private String name;

    @Column(name = "nacionalidade", nullable = true, length = 40)
    private String nacionality;

    // Incrementar lista de livros
    @JsonIgnore
    @OneToMany(mappedBy = "books")
    private List<BookModel> authors;
    


}
