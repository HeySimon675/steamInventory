package br.com.simao.steaminventory.item;

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
