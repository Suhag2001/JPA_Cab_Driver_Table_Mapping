package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class RatingTrips {
    final static int MAX = 100;
    final static int MIN = 1;
    static Random random = new Random();

    public static int getTrips() {
        int number = random.nextInt(MAX - MIN);
        int trip = MIN + number;
        return trip;
    }

}
