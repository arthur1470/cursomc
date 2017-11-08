package com.arthur.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
