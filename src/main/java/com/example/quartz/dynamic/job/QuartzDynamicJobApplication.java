package com.example.quartz.dynamic.job;

import com.example.quartz.dynamic.job.config.JobScheduleProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {JobScheduleProperties.class})
public class QuartzDynamicJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzDynamicJobApplication.class, args);
	}
}
