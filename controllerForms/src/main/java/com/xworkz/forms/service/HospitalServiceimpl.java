package com.xworkz.forms.service;

import com.xworkz.forms.dto.HospitalDto;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceimpl implements HospitalService{
    HospitalServiceimpl(){
        System.out.println("Running in a HospitalServiceimpl");
    }

    @Override
    public boolean validateAndSave(HospitalDto hospitalDto) {
        return true;
    }
}
