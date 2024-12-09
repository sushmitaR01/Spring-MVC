package com.xworkz.controller;

import com.xworkz.dto.MatrimonyDto;
import com.xworkz.service.MatrimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")

public class MatrimonyController {
    @Autowired
    private MatrimonyService matrimonyService;

    MatrimonyController(){
        System.out.println("Running in a MatrimonyController");
    }


    @RequestMapping("/matrimony")
    public  String matrimony(MatrimonyDto matrimonyDto){
        System.out.println("Running in a matrimony");
        System.out.println("OrganDonationDto is:"+matrimonyDto);
        boolean ref=this.matrimonyService.validateAndSave(matrimonyDto);
        if(ref){
            System.out.println("Sucessfully saved");
        }
        else {
            System.out.println("Failure");
        }
        return "Matrimony.jsp";
    }
}
