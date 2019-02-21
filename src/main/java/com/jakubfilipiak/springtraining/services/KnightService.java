package com.jakubfilipiak.springtraining.services;

import com.jakubfilipiak.springtraining.domain.Knight;
import com.jakubfilipiak.springtraining.domain.PlayerInformation;
import com.jakubfilipiak.springtraining.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Filipiak on 14.02.2019.
 */
@Component
public class KnightService {

    @Autowired
    KnightRepository knightRepository;

    public List<Knight> getAllKnights() {
        return new ArrayList<>(knightRepository.getAllKnights());
    }

    public void saveKnight(Knight knight) {
        knightRepository.createKnight(knight);
    }

    public Knight getKnight(Integer id) {
        return knightRepository.getKnightById(id);
    }

    public void deleteKnight(Integer id) {
        knightRepository.deleteKnight(id);
    }

    public void updateKnight(Knight knight) {
        knightRepository.updateKnight(knight.getId(), knight);
    }

    public int collectRewards() {
        int sum = knightRepository.getAllKnights().stream().filter(knight -> knight.getQuest().isCompleted())
                .mapToInt(knight -> knight.getQuest().getReward())
                .sum();
        knightRepository.getAllKnights().stream().filter(knight -> knight.getQuest().isCompleted()).forEach(knight -> knight.setQuest(null));

        return sum;
    }
}
