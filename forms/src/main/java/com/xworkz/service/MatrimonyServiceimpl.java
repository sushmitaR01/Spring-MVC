package com.xworkz.service;

import com.xworkz.dto.MatrimonyDto;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceimpl implements  MatrimonyService{
    @Override
    public boolean validateAndSave(MatrimonyDto matrimonyDto) {
        return true;
    }
}
