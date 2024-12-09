package com.xworkz.service;

import com.xworkz.dto.DeathCertificateDto;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements DeathCertificateService{
    DeathCertificateServiceImpl(){
        System.out.println("Running in a DeathCertificateServiceImpl");
    }
    @Override
    public boolean validateAndSave(DeathCertificateDto certificateDto) {
        return true;
    }
}
