package com.xworkz.controller;
import com.xworkz.service.DeathCertificateService;
import com.xworkz.dto.DeathCertificateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")

public class DeathCertificatecontroller {
    @Autowired
    private DeathCertificateService deathCertificateService;
    public DeathCertificatecontroller(){
        System.out.println("Running in a DeathCertificatecontroller");
    }
    @RequestMapping("/deceased")
    public  String save(DeathCertificateDto certificateDto)
    {
        System.out.println("Running in a save");
        System.out.println("DeathCertificateDto:"+certificateDto);
        boolean ref=this.deathCertificateService.validateAndSave(certificateDto);
        if(ref){
            System.out.println("Sucessfully saved");
        }
        else {
            System.out.println("Failure ");
        }
        return "DeathCertificate.jsp";
    }
}
