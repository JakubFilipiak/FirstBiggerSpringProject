package com.jakubfilipiak.springtraining.domain.repository;

import com.jakubfilipiak.springtraining.domain.Knight;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

/**
 * Created by Jakub Filipiak on 14.02.2019.
 */
public interface KnightRepository {

    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    void createKnight(Knight knight);

    Knight getKnightById(Integer id);

    default void updateKnight(int id, Knight knight) {
        throw new NotImplementedException();
    }
}
