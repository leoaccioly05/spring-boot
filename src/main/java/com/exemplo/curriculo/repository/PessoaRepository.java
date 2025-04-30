package com.exemplo.curriculo.repository;

import com.exemplo.curriculo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
