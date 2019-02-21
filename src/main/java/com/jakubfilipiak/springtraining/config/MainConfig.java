package com.jakubfilipiak.springtraining.config;

import com.jakubfilipiak.springtraining.domain.repository.DBKnightRepository;
import com.jakubfilipiak.springtraining.domain.repository.InMemoryRepository;
import com.jakubfilipiak.springtraining.domain.repository.KnightRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Jakub Filipiak on 12.02.2019.
 */
@Configuration
public class MainConfig {

    @Bean(name = "inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo() {
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name = "DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo() {
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }
}
