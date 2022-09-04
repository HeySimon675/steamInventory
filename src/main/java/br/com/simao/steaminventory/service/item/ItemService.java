package br.com.simao.steaminventory.service.item;

import br.com.simao.steaminventory.core.item.Item;
import br.com.simao.steaminventory.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Item cadastroDeItem(String nome, String codigo) {
        ItemBuilder builder = new ItemBuilder();
        builder.setNome(nome);
        builder.setCodigo(codigo);

        Item novoItem = builder.build();
        repository.save(novoItem);

        return novoItem;
    }
}
