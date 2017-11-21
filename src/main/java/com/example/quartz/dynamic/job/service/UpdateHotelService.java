package com.example.quartz.dynamic.job.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Ice on 11/4/2016.
 */
@Service
public class UpdateHotelService {

    private static final Logger log = LoggerFactory.getLogger(UpdateHotelService.class);

    public void updateAll(String dataToWrite) {
        log.info("The data is : " + dataToWrite);
    }
}
