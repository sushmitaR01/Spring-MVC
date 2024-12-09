package com.xworkz.forms.controller;

import com.xworkz.forms.dto.PassportDto;
import com.xworkz.forms.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {
    @Autowired
    private PassportService passportService;

    PassportController(){
        System.out.println("Running in a PassportController");
    }
    @RequestMapping("/passport")
    public  String book(PassportDto passportDto){
        System.out.println("Created a book");
        System.out.println("PassportDto:"+passportDto);
        boolean ref=this.passportService.validateAndSave(passportDto);
        if(ref){
            System.out.println("Sucessfully saved");
        }
        else {
            System.out.println("Failure");
        }
        return "Passport.jsp";
    }
}
