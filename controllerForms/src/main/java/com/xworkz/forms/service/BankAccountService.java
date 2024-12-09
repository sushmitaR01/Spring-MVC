package com.xworkz.forms.service;

import com.xworkz.forms.dto.BankAccountDto;
import org.springframework.stereotype.Service;

@Service
public interface BankAccountService {
    boolean validateAndSave(BankAccountDto bankAccountDto);
}
