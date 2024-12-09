package com.xworkz.components;

import com.xworkz.dto.JobDto;
import com.xworkz.dto.MatrimonyDto;
import com.xworkz.dto.OrganDonationDto;
import com.xworkz.dto.ScholarshipDto;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class ScholarshipComponent {

    public ScholarshipComponent(){
        System.out.println("Running in a ScholarshipComponent");
    }

    @RequestMapping("/save")
    public String save(){
        System.out.println("Running in a onSave");
        return "index.jsp";
    }



}
