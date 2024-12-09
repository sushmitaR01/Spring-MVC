package com.xworkz.service;

import com.xworkz.dto.ScholarshipDto;
import org.springframework.stereotype.Service;

@Service
public interface ScholorshipService {
    boolean validateAndSave(ScholarshipDto scholarshipDto);
}
