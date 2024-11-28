package com.xworkz.camera.components;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class Bridge implements Cameras{
    @Value("${username}")
    private String userName;

    @Value("${password}")
    private String hidden;

    @PostConstruct
    public void postCreation()
    {
        System.out.println("UserName :" +this.userName);
        System.out.println("hidden :"+this.hidden);
    }
    public Bridge() {
        System.out.println("Created no-arg const of Bridge");
    }

    @Override
    public int price() {
        return 20000;
    }

    @Override
    public String CameraType() {
        return "2D camera";
    }
}
