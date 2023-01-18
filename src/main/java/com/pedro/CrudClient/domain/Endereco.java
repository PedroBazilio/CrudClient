package com.pedro.CrudClient.domain;

import javax.persistence.*;
import java.util.Objects;

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    private String logradouro;

    private String CEP;

    private boolean numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public boolean isNumero() {
        return numero;
    }

    public void setNumero(boolean numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", CEP='" + CEP + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return numero == endereco.numero && Objects.equals(id, endereco.id) && Objects.equals(logradouro, endereco.logradouro) && Objects.equals(CEP, endereco.CEP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logradouro, CEP, numero);
    }
}
