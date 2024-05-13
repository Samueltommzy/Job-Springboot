package com.demo.starter.service;

import java.util.List;

import com.demo.starter.controllers.Job;

public interface JobService {
    List<Job> FindAllJobs();
    Job FindJobById(Long id);
    boolean UpdateJob(Long id, Job job);
    void CreateJob(Job job);
    boolean deleteJobById(Long id);
}
