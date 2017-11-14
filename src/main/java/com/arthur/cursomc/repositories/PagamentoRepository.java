package com.arthur.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
