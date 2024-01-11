package com.batch.springbatchtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchController {

    private final JobService jobService;

    public BatchController(JobService batchService) {
        this.jobService = batchService;
    }

    @GetMapping("/runjob")
    public String runJob() {
        try {
            jobService.launchJob();
            return "Job has been launched";
        } catch (Exception e) {
            return "Could not launch job";
        }
    }
}
