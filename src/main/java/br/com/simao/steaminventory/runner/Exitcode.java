package br.com.simao.steaminventory.runner;

public enum Exitcode {

    success(0),
    error(1),
    invalid_command(2);

    final int code;

    Exitcode(int code) {
        this.code = code;
    }
}
