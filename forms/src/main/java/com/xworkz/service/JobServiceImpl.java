package com.xworkz.service;

import com.xworkz.dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{
    JobServiceImpl(){
        System.out.println("Running in a JobServiceImpl");
    }

    @Override
    public boolean validateAndSave(JobDto jobDto) {
        return true;
    }
}
