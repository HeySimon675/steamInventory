package br.com.simao.steaminventory.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;
import picocli.CommandLine.IFactory;

@Component
public class Runner implements CommandLineRunner, ExitCodeGenerator {

    private final IFactory factory;
    private final InventoryCommand command;
    private int exitCode;

    public Runner(IFactory factory, InventoryCommand command) {
        this.factory = factory;
        this.command = command;
        //criar um command ao inves de deixar o spring alocar, porém tera de decidir pelo tipo do comando
    }

    @Override
    public void run(String... args) {
        exitCode = new CommandLine(command, factory).execute(args);
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }
}
