package com.xworkz.forms.service;

import com.xworkz.forms.dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public interface PassportService
{
    boolean validateAndSave(PassportDto passportDto);

}
