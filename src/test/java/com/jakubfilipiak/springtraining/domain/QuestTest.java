package com.jakubfilipiak.springtraining.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jakub Filipiak on 18.02.2019.
 */
public class QuestTest {

    @Test
    public void settingStartedFlagToFalseShouldSetStartDate() {
        Quest quest = new Quest(1, "Testowe zadanie");

        quest.setStarted(true);

        Assert.assertNotNull(quest.startDate);
    }

    @Test
    public void questShouldBeCompleted() {
        Quest quest = new Quest(1, "Testowe zadanie");
        quest.setStarted(true);
        quest.setLenghtInSeconds(-60);
        assertTrue(quest.isCompleted());
        assertTrue(quest.isCompleted());
    }

    @Test
    public void questShouldNotBeCompleted() {
        Quest quest = new Quest(1, "Testowe zadanie");
        quest.setStarted(true);
        quest.setLenghtInSeconds(20000);
        assertFalse(quest.isCompleted());
        assertFalse(quest.isCompleted());
    }
}
