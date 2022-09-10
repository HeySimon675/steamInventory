package br.com.simao.steaminventory.cli.command;

import br.com.simao.steaminventory.cli.runner.AbstractCommand;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Option;

import static br.com.simao.steaminventory.cli.runner.Exitcode.success;
import static picocli.CommandLine.Command;

@Component
@Command(name = "SteamInventoryManagerCLI",  version = "0.2.1", description = "Manage your skin inventory", mixinStandardHelpOptions = true,
    subcommands = {
        ItemCommand.class
    })
public class InventoryCommand extends AbstractCommand {

    @Option(names = {"-a", "--alo"}, description = "Alo alo alo")
    private boolean alo;

    @Option(names = {"-m", "--madu"}, description = "maduuuu")
    private boolean madu;

    @Override
    public Integer call() {
        String opcao = "";
        if(alo)
            opcao += "alo ";
        if(madu) {
            opcao += "madu ";
        }
        System.out.println("Comandos: " + opcao);
        return success.code;
    }
}
