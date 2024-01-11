package com.batch.springbatchtest;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchTestApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringBatchTestApplication.class, args);
    }

}
