package com.xworkz.service;

import com.xworkz.dto.MatrimonyDto;
import org.springframework.stereotype.Service;

@Service
public interface MatrimonyService {
    boolean validateAndSave(MatrimonyDto matrimonyDto);
}
