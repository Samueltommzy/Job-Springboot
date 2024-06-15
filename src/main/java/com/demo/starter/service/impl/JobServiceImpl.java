package com.demo.starter.service.impl;
import java.util.List;
import java.util.Optional;

import com.demo.starter.repository.JobRepository;
import org.springframework.stereotype.Service;

import com.demo.starter.controllers.Job;
import com.demo.starter.service.JobService;

@Service
public class JobServiceImpl implements JobService{
//    private List<Job> jobs = new ArrayList<>();
//    private Long jobId = 1L;
    JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> FindAllJobs(){
        return jobRepository.findAll();
    }
    @Override
    public void CreateJob(Job job){
        System.out.println("Herere");
//        job.SetId(jobId);
//        this.jobId += 1;
//        jobs.add(job);
        jobRepository.save(job);
    }
    @Override
    public Job FindJobById(Long id) {
//        for(Job job: jobs){
//            if(job.GetId().equals(id)){
//                return job;
//            }
//        }
        return jobRepository.findById(id).orElse(null);
//        return null;
    }
    @Override
    public boolean deleteJobById(Long id) {
        try{
            jobRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }

//       Iterator<Job> iterator = this.jobs.iterator();
//       while(iterator.hasNext()){
//        Job job = iterator.next();
//        if(job.GetId() == id){
//            iterator.remove();
//            return true;
//        }
//       }
//       return false;
    }
    @Override
    public boolean UpdateJob(Long id, Job updatedJob) {
      Optional<Job> optionalJob = jobRepository.findById(id);
      if(optionalJob.isPresent()) {
          Job job = optionalJob.get();
          job.setDescription(updatedJob.getDescription());
          job.setMaximumSalary(updatedJob.getMaximumSalary());
          job.setMinimumSalary(updatedJob.getMinimumSalary());
          job.setTitle(updatedJob.getTitle());
          jobRepository.save(job);
          return true;
      }
      return false;
    }
}
