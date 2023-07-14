package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class RatingAccepted {

    final static int MAX = RatingTrips.getTrips() ;
    final static int MIN = 1;
    static Random random = new Random();

    public static int getAcceptedss() {
        int number = random.nextInt(MAX - MIN + 1) + MIN;
        return number;
    }
}
