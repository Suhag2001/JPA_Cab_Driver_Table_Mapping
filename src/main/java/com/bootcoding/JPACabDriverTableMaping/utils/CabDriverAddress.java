package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class CabDriverAddress {

    private static String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose", "Austin", "Jacksonville", "San Francisco", "Indianapolis", "Seattle", "Denver", "Washington, D.C.", "Boston", "Nashville", "Detroit"};

    public static String getAdress() {
        Random random = new Random();
        int randomIndex = random.nextInt(cities.length);
        return cities[randomIndex];
    }

}
