package com.xworkz.service;

import com.xworkz.dto.OrganDonationDto;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationServiceImpl implements  OrganDonationService{
    OrganDonationServiceImpl(){
        System.out.println("Running in a OrganDonationServiceImpl");
    }
    @Override
    public boolean validateAndSave(OrganDonationDto organDonationDto) {
        return false;
    }
}
