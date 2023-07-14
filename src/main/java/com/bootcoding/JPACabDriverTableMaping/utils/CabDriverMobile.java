package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class CabDriverMobile {
    final static int MAX = 999999999;
    final static int MIN = 100000000;
    static Random random = new Random();

    public static int getPhoneNumber() {
        int number = random.nextInt(MAX - MIN);
        int num = MIN + number;
        return num;
    }

}
