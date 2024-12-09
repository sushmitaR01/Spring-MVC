package com.xworkz.controller;

import com.xworkz.dto.ScholarshipDto;
import com.xworkz.service.ScholorshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Component
public class ScholarshipController {
    @Autowired
    private ScholorshipService scholorshipService;
    ScholarshipController(){
        System.out.println("Running in a ScholarshipController");
    }

    @RequestMapping("/apply")
    public  String onApply(ScholarshipDto scholarshipDto){
        System.out.println("running in a apply");
        System.out.println("ScholarshipDto is:"+scholarshipDto);
        boolean ref=this.scholorshipService.validateAndSave(scholarshipDto);
        if(ref){
            System.out.println("Sucessfully saved");
        }
        else {
            System.out.println("Failure saved");
        }
        return "Schlorship.jsp";
    }
}
