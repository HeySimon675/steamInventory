package br.com.simao.steaminventory.core.item;

public class ValidadorItem {

    private static final int TAMANHO_MAX_NOME = 50;

    public void validaItem(Item item) {
        if(!isNomeValido(item.getNome()))
            throw new RuntimeException("Nome inválido para Item");
    }

    private boolean isNomeValido(String nome) {
        if (nome != null)
            return isNomeDeTamanhoValido(nome);

        return false;
    }

    private boolean isNomeDeTamanhoValido(String nome) {
        return nome.length() <= TAMANHO_MAX_NOME;
    }

}
