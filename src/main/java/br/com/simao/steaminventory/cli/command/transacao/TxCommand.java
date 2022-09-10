package br.com.simao.steaminventory.cli.command.transacao;

import br.com.simao.steaminventory.cli.command.InventoryCommand;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command
public abstract class TxCommand extends InventoryCommand {

    @Option(names = {"-c", "--code"})
    private String codigo;

    @Option(names = {"-n", "--name"}, required = true)
    private String nome;

    @Option(names = {"-v", "--value"})
    private Double valor;

    @Option(names = {"-q", "--qtd", "--quantity"})
    private Integer quantidade;

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @ParentCommand
    private InventoryCommand parentCommand;
}
