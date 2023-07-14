package com.bootcoding.JPACabDriverTableMaping;

import com.bootcoding.JPACabDriverTableMaping.controller.CabDriverController;
import com.bootcoding.JPACabDriverTableMaping.entity.CabDriver;
import com.bootcoding.JPACabDriverTableMaping.entity.Rating;
import com.bootcoding.JPACabDriverTableMaping.repo.CabDriverRepo;
import com.bootcoding.JPACabDriverTableMaping.repo.RatingRepo;
import com.bootcoding.JPACabDriverTableMaping.service.CabDriverService;
import com.bootcoding.JPACabDriverTableMaping.utils.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaCabDriverTableMapingApplication {


    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(JpaCabDriverTableMapingApplication.class, args);

        CabDriverRepo cabRepo = context.getBean(CabDriverRepo.class);
        RatingRepo rateRepo = context.getBean(RatingRepo.class);


        for (int i = 0; i < 100; i++) {
            CabDriver cab = new CabDriver();
            cab.setName(CabDriverNames.getName());
            cab.setEmail(CabDriverEmail.getEmails());
            cab.setAddress(CabDriverAddress.getAdress());
            cab.setMobile(CabDriverMobile.getPhoneNumber());
            cab = cabRepo.save(cab);

            Rating rate = new Rating();
            rate.setCabDriver(cab);
            rate.setTrips(RatingTrips.getTrips());
            rate.setAccepted(RatingAccepted.getAcceptedss());
            rate.setCancelled(RatingCancelled.getCancelledss());
            rate = rateRepo.save(rate);
        }

    }

}
