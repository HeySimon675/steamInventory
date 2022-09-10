package br.com.simao.steaminventory.cli.command.transacao;


import picocli.CommandLine;

@CommandLine.Command(name = "buy", description = "Registra compra", version = "0.1")
public class CompraCommand extends TxCommand {

    @Override
    public Integer call() {
        return super.call();
    }
}
