package com.xworkz.service;

import com.xworkz.dto.ScholarshipDto;
import org.springframework.stereotype.Service;

@Service
public class ScholorshipServiceImpl implements  ScholorshipService{
    ScholorshipServiceImpl(){
        System.out.println("Running in a ScholorshipServiceImpl");
    }
    @Override
    public boolean validateAndSave(ScholarshipDto scholarshipDto) {
        return true;
    }
}
