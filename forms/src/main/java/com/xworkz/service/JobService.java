package com.xworkz.service;

import com.xworkz.dto.JobDto;
import org.springframework.stereotype.Service;

@Service
public interface JobService {
    boolean validateAndSave(JobDto jobDto);
}
