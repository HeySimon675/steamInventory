package br.com.simao.steaminventory.domain.item;

import org.hibernate.id.UUIDGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
}
