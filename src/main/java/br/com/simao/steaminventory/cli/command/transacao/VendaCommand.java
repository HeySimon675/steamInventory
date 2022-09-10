package br.com.simao.steaminventory.cli.command.transacao;

import picocli.CommandLine.Command;

@Command(name = "sell", description = "Registra venda", version = "0.1")
public class VendaCommand extends TxCommand {

    @Override
    public Integer call() {
        return super.call();
    }
}
