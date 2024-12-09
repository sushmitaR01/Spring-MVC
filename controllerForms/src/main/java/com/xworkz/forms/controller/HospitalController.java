package com.xworkz.forms.controller;

import com.xworkz.forms.dto.HospitalDto;
import com.xworkz.forms.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    HospitalController(){
        System.out.println("Running in HospitalController");
    }
  @RequestMapping("/hospital")
    public  String checkUp(HospitalDto hospitalDto){
        System.out.println("created a checkUp");
        System.out.println("HospitalDto is :"+hospitalDto);
        boolean ref=this.hospitalService.validateAndSave(hospitalDto);
        if(ref){
            System.out.println("Sucessfully saved");
        }
        else {
            System.out.println("Failed");
        }
        return "Hospital.jsp";

    }
}
