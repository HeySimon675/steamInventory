package br.com.simao.steaminventory.service.item;

import br.com.simao.steaminventory.core.item.Item;

public class ItemService {

    public Item cadastroDeItem(String nome, String codigo) {

        //validar parametros
        ItemBuilder builder = new ItemBuilder();
        builder.setNome(nome);
        builder.setCodigo(codigo);

        Item novoItem = builder.build();
        //Registra item no banco

        return novoItem;
    }
}
