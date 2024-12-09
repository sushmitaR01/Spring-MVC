package com.xworkz.service;

import com.xworkz.dto.DeathCertificateDto;
import org.springframework.stereotype.Service;

@Service
public interface DeathCertificateService {
    boolean validateAndSave(DeathCertificateDto certificateDto);
}
