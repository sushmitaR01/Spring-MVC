package com.xworkz.forms.controller;

import com.xworkz.forms.dto.BankAccountDto;
import com.xworkz.forms.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Controller
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;

    BankAccountController(){
        System.out.println("Running in a BankAccountController");
    }
    @RequestMapping("/account")
    public  String onAccount(BankAccountDto bankAccountDto){
        System.out.println("Running in a onAccont");
        System.out.println("BankAccountDto:"+bankAccountDto);
        boolean ref=this.bankAccountService.validateAndSave(bankAccountDto);
        if(ref){
            System.out.println("Sucessfully saved");
        }
        else {
            System.out.println("Failure");
        }
        return "BankAccont.jsp";
    }
}
