package br.com.simao.steaminventory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import picocli.CommandLine;
import picocli.CommandLine.IFactory;

@SpringBootApplication
@EnableJpaRepositories
public class SteamInventoryApplication implements CommandLineRunner, ExitCodeGenerator {

    private final IFactory factory;
    private final InventoryCommand command;
    private int exitCode;

    public SteamInventoryApplication(IFactory factory, InventoryCommand command) {
        this.factory = factory;
        this.command = command;
    }

    public static void main(String[] args) {
        SpringApplication.run(SteamInventoryApplication.class, args);
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
