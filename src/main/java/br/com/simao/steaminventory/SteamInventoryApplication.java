package br.com.simao.steaminventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SteamInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteamInventoryApplication.class, args);
    }
}
