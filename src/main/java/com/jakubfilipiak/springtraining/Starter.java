package com.jakubfilipiak.springtraining;

import com.jakubfilipiak.springtraining.domain.repository.InMemoryRepository;
import com.jakubfilipiak.springtraining.domain.repository.KnightRepository;
import com.jakubfilipiak.springtraining.domain.repository.QuestRepository;
import com.jakubfilipiak.springtraining.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jakub Filipiak on 11.02.2019.
 */
@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... strings) throws Exception {

        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        questService.assignRandomQuest("Percival");
    }
}