package com.exemplo.curriculo.repository;

import com.exemplo.curriculo.model.Formacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormacaoRepository extends JpaRepository<Formacao, Long> {
}
