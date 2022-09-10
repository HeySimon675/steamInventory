package br.com.simao.steaminventory.core;

import javax.persistence.Entity;

@Entity
public class Usuario extends Entidade {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
