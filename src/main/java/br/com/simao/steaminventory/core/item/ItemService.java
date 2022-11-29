package br.com.simao.steaminventory.core.item;

import org.springframework.stereotype.Service;

import java.util.List;

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

    public Item pesquisa(String codigo, String nome) {
        if (codigo == null)
            return pesquisaDadoNome(nome).get(0);

        return pesquisaPorCodigo(codigo);
    }

    private Item pesquisaPorCodigo(String codigo) {
        return repository.findByCodigo(codigo).orElse(null);
    }

    public List<Item> pesquisaDadoNome(String nome) {
        return repository.findBydNomeIsLikeIgnoreCase(nome);
    }
}
