package com.example.quartz.dynamic.job.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Ice on 11/4/2016.
 */
@ConfigurationProperties(prefix = "schedule")
public class JobScheduleProperties {

    @NotNull
    @NotEmpty
    @Valid
    private List<JobProperties> jobs;

    public List<JobProperties> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobProperties> jobs) {
        this.jobs = jobs;
    }
}
