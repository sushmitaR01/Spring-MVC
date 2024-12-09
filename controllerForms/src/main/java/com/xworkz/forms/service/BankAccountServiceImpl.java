package com.xworkz.forms.service;

import com.xworkz.forms.dto.BankAccountDto;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService{
    BankAccountServiceImpl(){
        System.out.println("Running in a BankAccountServiceImpl");
    }

    @Override
    public boolean validateAndSave(BankAccountDto bankAccountDto) {
        return true;
    }
}
