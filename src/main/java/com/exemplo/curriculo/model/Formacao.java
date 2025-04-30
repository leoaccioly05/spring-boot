package com.exemplo.curriculo.model;

import jakarta.persistence.*;

@Entity
public class Formacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String curso;
    private String instituicao;
    private String conclusao;

    @ManyToOne
    @JoinColumn(name = "curriculo_id")
    private Curriculo curriculo;

    public Long getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public String getConclusao() {
        return conclusao;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }
}
