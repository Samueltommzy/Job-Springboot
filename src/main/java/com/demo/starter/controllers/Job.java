package com.demo.starter.controllers;

public class Job {
    private Long id;
    private String title;
    private String description;
    private String minimumSalary;
    private String maximumSalary;

    public Job(Long id,String title,String description,String minimumSalary,String maximumSalary) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.minimumSalary = minimumSalary;
        this.maximumSalary = maximumSalary;
    }

    public Long GetId() {
        return this.id;
    }
    public String GetTitle() {
        return this.title;
    }
    public String GetDescription() {
        return this.description;
    }
    public String GetMinimumSalary() {
        return this.minimumSalary;
    }
    public String GetMaximumSalary() {
        return this.maximumSalary;
    }
    public void SetId(Long id) {
        this.id = id;
    }
    public void SetDescription(String description) {
        this.description = description;
    }
    public void SetTitle(String title) {
        this.title = title;
    }
    public void SetMinimumSalary(String salary) {
        this.minimumSalary = salary;
    }
    public void SetMaximumSalary(String salary) {
        this.maximumSalary = salary;
    }
}
