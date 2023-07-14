package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class CabDriverEmail {
    private static String[] emails = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "aol.com", "icloud.com", "protonmail.com"};

    public static String getEmails() {
        Random random = new Random();
        int randomIndex = random.nextInt(emails.length);
        return emails[randomIndex];
    }

}
