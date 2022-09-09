package br.com.simao.steaminventory.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;
import picocli.CommandLine.IFactory;

import java.util.Scanner;
import java.util.stream.Stream;

@Component
public class Runner implements CommandLineRunner, ExitCodeGenerator {

    private CommandLine commandLine;
    private int exitCode;
    private final Scanner scanner;

    public Runner(IFactory factory, InventoryCommand command) {
        setCommandLine(new CommandLine(command, factory));
        scanner = new Scanner(System.in);
    }

    @Override
    public void run(String... args) {
        System.out.println("\nSteam Inventory Helper\n");

        execute(args);

        System.out.println("\nSaindo...\n");
    }

    private void execute(String[] comandos) {
        while (true) {
            exitCode = commandLine().execute(comandos);

            if(contemComandoDeSaida(comandos))
                break;

            comandos = getNextCommands();
        }
    }

    private String[] getNextCommands() {
        System.out.println("Comando: ");

        return scanner().nextLine().split(" ");
    }

    private boolean contemComandoDeSaida(String[] comandos) {
        return Stream.of(comandos).anyMatch(this::isComandoDeSaida);
    }

    private boolean isComandoDeSaida(String comando) {
        return comando.equals("-e") || comando.equals("--exit");
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }

    public void setCommandLine(CommandLine commandLine) {
        this.commandLine = commandLine;
    }

    public CommandLine commandLine() {
        return commandLine;
    }

    public Scanner scanner() {
        return scanner;
    }
}
