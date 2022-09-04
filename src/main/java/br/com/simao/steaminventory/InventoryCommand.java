package br.com.simao.steaminventory;

import br.com.simao.steaminventory.service.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

import static picocli.CommandLine.Command;

@Component
@Command(name = "SteamInventoryManagerCLI", mixinStandardHelpOptions = true, version = "0.1", description = "Manage your skin inventory with style")
public class InventoryCommand implements Callable<Integer> {

    @Option(names = {"-h", "--help"},
    paramLabel = "HELP", description = "Quick guide to use", required = true)
    String option;

    @Autowired
    private ItemService itemService;

    @Override
    public Integer call() {

        System.out.println("Executando opção -h: " + this.option);
        return 0;
    }
}