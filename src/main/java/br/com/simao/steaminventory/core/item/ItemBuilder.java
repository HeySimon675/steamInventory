package br.com.simao.steaminventory.core.item;

public class ItemBuilder {

    private String codigo;
    private String nome;

    public Item build() {
        Item item = new Item(nome, codigo);
        new ValidadorItem().validaItem(item);

        return item;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
