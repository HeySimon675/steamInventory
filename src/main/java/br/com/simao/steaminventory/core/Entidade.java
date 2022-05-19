package br.com.simao.steaminventory.core;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Entidade {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Date dataCriacao;

    private Date dataAtualizacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    @PrePersist
    private void setDataCriacao() {
        this.dataCriacao = new Date();
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    @PreUpdate
    private void setDataAtualizacao() {
        this.dataAtualizacao = new Date();
    }
}
