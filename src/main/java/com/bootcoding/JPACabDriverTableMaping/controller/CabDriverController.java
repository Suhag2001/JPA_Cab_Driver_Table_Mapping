package com.bootcoding.JPACabDriverTableMaping.controller;

import com.bootcoding.JPACabDriverTableMaping.entity.CabDriver;
import com.bootcoding.JPACabDriverTableMaping.service.CabDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabDriverController {

    @Autowired
    private CabDriverService service;

    @PostMapping("insertCabDriver")
    public void insertCanDriver(@RequestBody CabDriver cabDriver) {
         service.insertCabDriver(cabDriver);
    }
}
