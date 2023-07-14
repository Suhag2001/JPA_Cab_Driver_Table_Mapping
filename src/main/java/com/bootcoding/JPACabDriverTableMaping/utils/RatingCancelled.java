package com.bootcoding.JPACabDriverTableMaping.utils;

import java.util.Random;

public class RatingCancelled {



    public static int getCancelledss() {

        int cancle = RatingTrips.getTrips() - RatingAccepted.getAcceptedss();
        return cancle;
    }

}
