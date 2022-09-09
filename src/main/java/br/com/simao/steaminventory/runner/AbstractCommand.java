package br.com.simao.steaminventory.runner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

import static br.com.simao.steaminventory.runner.Exitcode.invalid_command;

@Command
public abstract class AbstractCommand implements Callable<Integer> {

    @Option(names = {"-e", "--exit"}, description = "finaliza aplicação")
    private boolean exit;

    @Override
    public Integer call() {
        return invalid_command.code;
    }
}
