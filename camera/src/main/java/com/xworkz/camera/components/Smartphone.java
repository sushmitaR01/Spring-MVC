package com.xworkz.camera.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Smartphone {
    @Autowired
    @Qualifier("typesin camera")
    private String CameraType;



    @Autowired
    @Qualifier("anything")
    private Cameras cameras;


    public Smartphone() {
        System.out.println("Created no-arg const of Smartphone");
    }
}
