package com.xworkz.controller;

import com.xworkz.dto.OrganDonationDto;
import com.xworkz.service.OrganDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class OrganDonationController {
    @Autowired
    private OrganDonationService organDonationService;
    OrganDonationController(){
        System.out.println("Running in a OrganDonationController");
    }

    @RequestMapping("/organ")
    public  String organ(OrganDonationDto organDonationDto){
        System.out.println("Running in a organ");
        System.out.println("OrganDonationDto is:"+organDonationDto);
        boolean ref=this.organDonationService.validateAndSave(organDonationDto);
        if(ref){
            System.out.println("Successfully saved");
        }
        else {
            System.out.println("failure");
        }
        return "organ.jsp";
    }
}
