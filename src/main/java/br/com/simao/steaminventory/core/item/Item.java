package br.com.simao.steaminventory.core.item;

import br.com.simao.steaminventory.core.Entidade;

import javax.persistence.Entity;

@Entity
public class Item extends Entidade {

    private String nome;

    private String codigo;

    public Item(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Item() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
