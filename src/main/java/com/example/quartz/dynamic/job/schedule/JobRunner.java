package com.example.quartz.dynamic.job.schedule;

import com.example.quartz.dynamic.job.service.UpdateHotelService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ice on 11/4/2016.
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class JobRunner implements Job {

    private String dataToWrite;

    @Autowired
    private UpdateHotelService updateHotelService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        updateHotelService.updateAll(dataToWrite);
    }

    public void setDataToWrite(String dataToWrite) {
        this.dataToWrite = dataToWrite;
    }
}
