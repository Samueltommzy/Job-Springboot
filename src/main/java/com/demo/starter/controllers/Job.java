package com.demo.starter.controllers;

import jakarta.persistence.*;

@Entity
//@Table(name = "job_table")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String minimumSalary;
    private String maximumSalary;

    public Job() {
    }

    public Job(Long id, String title, String description, String minimumSalary, String maximumSalary) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minimumSalary = minimumSalary;
        this.maximumSalary = maximumSalary;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMinimumSalary() {
        return minimumSalary;
    }

    public String getMaximumSalary() {
        return maximumSalary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMinimumSalary(String minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public void setMaximumSalary(String maximumSalary) {
        this.maximumSalary = maximumSalary;
    }
    //    public Long GetId() {
//        return id;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public String GetDescription() {
//        return description;
//    }
//    public String GetMinimumSalary() {
//        return minimumSalary;
//    }
//    public String GetMaximumSalary() {
//        return maximumSalary;
//    }
//    public void SetId(Long id) {
//        this.id = id;
//    }
//    public void SetDescription(String description) {
//        this.description = description;
//    }
//    public void SetTitle(String title) {
//        this.title = title;
//    }
//    public void SetMinimumSalary(String salary) {
//        this.minimumSalary = salary;
//    }
//    public void SetMaximumSalary(String salary) {
//        this.maximumSalary = salary;
//    }
}
