package com.jakubfilipiak.springtraining.domain;

import java.time.LocalDateTime;

/**
 * Created by Jakub Filipiak on 11.02.2019.
 */
public class Quest {

    private int id;

    private String description;

    private int reward = 100;

    protected int lenghtInSeconds = 3;

    private boolean started = false;

    private boolean completed = false;

    protected LocalDateTime startDate;

    public Quest(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getLenghtInSeconds() {
        return lenghtInSeconds;
    }

    public void setLenghtInSeconds(int lenghtInSeconds) {
        this.lenghtInSeconds = lenghtInSeconds;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        if (started) {
            this.startDate = LocalDateTime.now();
        }
        this.started = started;
    }

    public boolean isCompleted() {

        if (this.completed) {
            return this.completed;
        } else {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime questEndDate =
                    this.startDate.plusSeconds(this.lenghtInSeconds);

            boolean isAfter = now.isAfter(questEndDate);

            if (isAfter) {
                this.completed = true;
            }

            return isAfter;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

