package br.com.simao.steaminventory.cli.command;

import br.com.simao.steaminventory.cli.command.transacao.CompraCommand;
import br.com.simao.steaminventory.cli.command.transacao.VendaCommand;
import br.com.simao.steaminventory.cli.runner.AbstractCommand;
import org.springframework.stereotype.Component;

import static br.com.simao.steaminventory.cli.runner.Exitcode.success;
import static picocli.CommandLine.Command;

@Component
@Command(name = "SteamInventoryManagerCLI",  version = "0.3.1", description = "Manage your skin inventory", mixinStandardHelpOptions = true,
    subcommands = {
        CompraCommand.class,
        VendaCommand.class
    })
public class InventoryCommand extends AbstractCommand {

    @Override
    public Integer call() {
        return success.code;
    }
}
