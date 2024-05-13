package com.demo.starter.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.starter.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @PostMapping
    public ResponseEntity<String> CreateJob(@RequestBody Job job){
        jobService.CreateJob(job);
        return new ResponseEntity<String>("Successfully created Job",HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Job>> FindAllJobs() {
        return new ResponseEntity<List<Job>>(jobService.FindAllJobs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> FindJobById(@PathVariable Long id) {
        Job job =  jobService.FindJobById(id);
        if (job != null) {
            return new ResponseEntity<Job>(job, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> UpdateJob(@PathVariable Long id, @RequestBody Job job){
        boolean isUpdated = jobService.UpdateJob(id,job);
        if(isUpdated){
            return new ResponseEntity<String>("Successfully updated Job",HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> DeleteJobById(@PathVariable Long id){
        boolean isDeleted = jobService.deleteJobById(id);
        if(isDeleted){
            return new ResponseEntity<String>("Successfully Deleted Job",HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
