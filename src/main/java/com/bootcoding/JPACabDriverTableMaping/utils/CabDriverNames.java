package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class CabDriverNames {
    private static String[] names =
            {"Ramesh sinha", "Suresh dadmal", "Jayesh Nanhe", "Ganesh",
                    "Mahesh sinha", "Rajesh Nanhe", "Mitesh dadmal", "Dinesh sinha",
                    "Pooja sinha", "Priya Nanhe", "Pinkydadmal",
                    "Manisha sinha", "Usha Nanhe", "Asha dadmal", "Diksha sinha", "Nisha Nanhe"};

    public static String getName() {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

}
