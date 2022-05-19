package br.com.simao.steaminventory.domain.usuario;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private Integer id;
    private String nome;

}
