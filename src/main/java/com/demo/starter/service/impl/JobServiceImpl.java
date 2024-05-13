package com.demo.starter.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.starter.controllers.Job;
import com.demo.starter.service.JobService;

@Service
public class JobServiceImpl implements JobService{
    private List<Job> jobs = new ArrayList<>();
    private Long jobId = 1L;

    @Override
    public List<Job> FindAllJobs(){
        return jobs;
    }
    @Override
    public void CreateJob(Job job){
        job.SetId(jobId);
        this.jobId += 1;
        jobs.add(job);
    }
    @Override
    public Job FindJobById(Long id) {
        for(Job job: jobs){
            if(job.GetId().equals(id)){
                return job;
            }
        }
        return null;
    }
    @Override
    public boolean deleteJobById(Long id) {
       Iterator<Job> iterator = this.jobs.iterator();
       while(iterator.hasNext()){
        Job job = iterator.next();
        if(job.GetId() == id){
            iterator.remove();
            return true;
        }
       }
       return false;
    }
    @Override
    public boolean UpdateJob(Long id, Job updatedJob) {
      Job job = this.FindJobById(id);
      if(job != null) {
        job.SetDescription(updatedJob.GetDescription());
        job.SetMaximumSalary(updatedJob.GetMaximumSalary());
        job.SetMinimumSalary(updatedJob.GetMinimumSalary());
        job.SetTitle(updatedJob.GetTitle());
        return true;
      }
      return false;
    }
}
