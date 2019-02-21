package com.jakubfilipiak.springtraining.utils;

import java.util.Comparator;
import java.util.Set;

/**
 * Created by Jakub Filipiak on 16.02.2019.
 */
public class Ids {

    public static int generateNewId(Set<Integer> keysSoFar)  {
        if (keysSoFar.isEmpty()) {
            return 0;
        } else {
            Integer integer = keysSoFar.stream().max(Comparator.naturalOrder()).get();
            return integer + 1;
        }
    }
}
