package com.xworkz.forms.service;

import com.xworkz.forms.dto.HospitalDto;
import org.springframework.stereotype.Service;

@Service
public interface HospitalService {
    boolean validateAndSave(HospitalDto hospitalDto);
}
