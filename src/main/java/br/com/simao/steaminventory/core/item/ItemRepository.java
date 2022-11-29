package br.com.simao.steaminventory.core.item;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findBydNomeIsLikeIgnoreCase(String nome);

    Optional<Item> findByCodigo(String codigo);
}
