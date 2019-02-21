package com.jakubfilipiak.springtraining.domain.repository;

import com.jakubfilipiak.springtraining.domain.Quest;
import com.jakubfilipiak.springtraining.utils.Ids;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by Jakub Filipiak on 13.02.2019.
 */
@Repository
public class QuestRepository {

    Random rand = new Random();

    Map<Integer, Quest> quests = new HashMap<>();


    public void createQuest(String description) {
        int newId = Ids.generateNewId(quests.keySet());
        Quest newQuest = new Quest(newId, description);
        quests.put(newId, newQuest);
    }

    public List<Quest> getAll() {
        return new ArrayList<>(quests.values());
    }

    public void deleteQuest(Quest quest) {
        quests.remove(quest.getId());
    }

    @PostConstruct
    public void init() {

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + quests +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj ksiezniczke");
        descriptions.add("Wez udzial w turnieju");
        descriptions.add("Zabij bande goblinow");
        descriptions.add("Zabij smoka");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        createQuest(description);
    }

    public void update(Quest quest) {
        quests.put(quest.getId(), quest);
    }

    public Quest getQuest(Integer id) {
        return quests.get(id);
    }
}