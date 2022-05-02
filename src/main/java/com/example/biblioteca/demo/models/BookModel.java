package com.example.biblioteca.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "TB_LIVROS")
@Data
public class BookModel {
    
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Id
    private Long id;

    @Column(name = "nome_livros", nullable = false, length = 150)
    private String book_name;
    // Incrementar ligação de tabelas.

    @Column(name = "edicao", nullable = true, length = 100)
    private String edition;

    @ManyToOne
    @JoinColumn(name="author_id")
    private AuthorModel books;

    
}
