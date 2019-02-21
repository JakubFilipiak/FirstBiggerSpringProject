package com.jakubfilipiak.springtraining.domain;

import org.springframework.stereotype.Component;

/**
 * Created by Jakub Filipiak on 15.02.2019.
 */
@Component
public class PlayerInformation {

    private int gold = 0;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
