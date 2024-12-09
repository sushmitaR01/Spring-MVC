package com.xworkz.forms.service;

import com.xworkz.forms.dto.PassportDto;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{
    PassportServiceImpl(){
        System.out.println("Running in a PassportServiceImpl");
    }


    @Override
    public boolean validateAndSave(PassportDto passportDto) {
        return true;
    }
}
