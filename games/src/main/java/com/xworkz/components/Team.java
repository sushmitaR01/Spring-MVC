package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Team {
    @Autowired
    private String teamName;
    Team(){
        System.out.println("Running in a Team");
    }

}
