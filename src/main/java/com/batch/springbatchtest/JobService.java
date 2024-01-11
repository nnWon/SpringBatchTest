package com.batch.springbatchtest;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobLauncher jobLauncher;
    private final Job job;

    public void launchJob() throws Exception {
        jobLauncher.run(job, new JobParameters());
    }
}