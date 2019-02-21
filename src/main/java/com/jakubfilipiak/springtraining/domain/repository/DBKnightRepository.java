package com.jakubfilipiak.springtraining.domain.repository;

import com.jakubfilipiak.springtraining.domain.Knight;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

/**
 * Created by Jakub Filipiak on 14.02.2019.
 */
public class DBKnightRepository implements KnightRepository{

    @Override
    public void createKnight(String name, int age) {
        System.out.println("uzywam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public Collection<Knight> getAllKnights() {
        System.out.println("uzywam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public Optional<Knight> getKnight(String name) {
        System.out.println("uzywam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public void deleteKnight(Integer id) {
        System.out.println("uzywam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    @PostConstruct
    public void build() {

    }

    @Override
    public void createKnight(Knight knight) {
        System.out.println("uzywam bazy danych");
        throw new NotImplementedException();
    }

    @Override
    public Knight getKnightById(Integer id) {
        System.out.println("uzywam bazy danych");
        throw new NotImplementedException();
    }
}
