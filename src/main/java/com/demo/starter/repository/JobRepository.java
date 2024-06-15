package com.demo.starter.repository;

import com.demo.starter.controllers.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}
