package com.xworkz.controller;

import com.xworkz.dto.JobDto;
import com.xworkz.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Component
public class JobController {
    @Autowired
    private JobService jobService;
    JobController(){
        System.out.println("Running in a JobController");


    }
    @RequestMapping("/applyjob")
    public  String applyjob(JobDto jobDto){
        System.out.println("Running in a jobapply");
        System.out.println("JobDto is:"+jobDto);
        boolean ref=this.jobService.validateAndSave(jobDto);
        if(ref){
            System.out.println("sucessfully saved");
        }
        else{
            System.out.println("Failed");
        }
        return "job.jsp";
    }
}
