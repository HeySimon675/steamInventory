package br.com.simao.steaminventory.service.item;

import br.com.simao.steaminventory.core.item.Item;

public class ItemBuilder {

    private static final int TAMANHO_MAX_NOME = 50;
    private String codigo;
    private String nome;

    public Item build() {
        //todo Criar ValidadorItem, para centralizar a validação independente da chamada (cadastro/alteracao)
        if(!isNomeValido())
            throw new RuntimeException("Nome inválido para Item");

        return new Item(nome, codigo);
    }

    private boolean isNomeValido() {
        if (nome == null) {
            return false;
        }

        return isNomeDeTamanhoValido();
    }

    private boolean isNomeDeTamanhoValido() {
        return nome.length() <= TAMANHO_MAX_NOME;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
