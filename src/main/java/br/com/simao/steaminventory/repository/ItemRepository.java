package br.com.simao.steaminventory.repository;

import br.com.simao.steaminventory.core.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
