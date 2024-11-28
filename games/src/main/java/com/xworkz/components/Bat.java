package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bat {
    @Autowired
    private double batCost;
    Bat(){

        System.out.println("Running in a Bat");
    }

}
