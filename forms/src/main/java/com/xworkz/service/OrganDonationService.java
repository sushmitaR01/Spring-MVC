package com.xworkz.service;

import com.xworkz.dto.OrganDonationDto;
import org.springframework.stereotype.Service;

@Service
public interface OrganDonationService {
    boolean validateAndSave(OrganDonationDto organDonationDto);
}
