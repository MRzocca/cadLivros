package com.murilo.Gerenciamento.de.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilo.Gerenciamento.de.livros.entities.livro;

public interface livroRepository extends JpaRepository<livro, Long>{

}
