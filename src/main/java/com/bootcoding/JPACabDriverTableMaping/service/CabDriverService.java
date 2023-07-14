package com.bootcoding.JPACabDriverTableMaping.service;

import com.bootcoding.JPACabDriverTableMaping.entity.CabDriver;
import com.bootcoding.JPACabDriverTableMaping.entity.Rating;
import com.bootcoding.JPACabDriverTableMaping.repo.CabDriverRepo;
import com.bootcoding.JPACabDriverTableMaping.repo.RatingRepo;
import com.bootcoding.JPACabDriverTableMaping.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabDriverService {

    @Autowired
    private CabDriverRepo cabRepo;
    @Autowired
    private RatingRepo ratingRepo;

    public void insertCabDriver(CabDriver cabDriver){
        CabDriver cab = new CabDriver();
        cab.setName(cabDriver.getName());
        cab.setEmail(cabDriver.getEmail());
        cab.setAddress(cabDriver.getAddress());
        cab.setMobile(cabDriver.getMobile());
        cab = cabRepo.save(cab);

        Rating rate = new Rating();
        rate.setTrips(cabDriver.getRating().getTrips());
        rate.setAccepted(cabDriver.getRating().getAccepted());
        rate.setCancelled(cabDriver.getRating().getCancelled());
        rate.setCabDriver(cab);
        rate = ratingRepo.save(rate);
    }



}
