package com.jakubfilipiak.springtraining.services;

import com.jakubfilipiak.springtraining.domain.Quest;
import com.jakubfilipiak.springtraining.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by Jakub Filipiak on 17.02.2019.
 */
@Service
public class QuestFormatter implements Formatter<Quest> {

    @Autowired
    QuestRepository repository;

    @Override
    public Quest parse(String idAsStr, Locale locale) throws ParseException {
        Integer id = Integer.parseInt(idAsStr);
        return repository.getQuest(id);
    }

    @Override
    public String print(Quest object, Locale locale) {
        return object.toString();
    }
}
