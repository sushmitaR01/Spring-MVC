package com.xworkz.camera.components;
public class Mirrorless implements Cameras{
    public Mirrorless(){
        System.out.println("Running in a Mirrorless");
    }
    @Override
    public int price() {
        return 150000;
    }

    @Override
    public String CameraType() {
        return "HD camera";
    }
}
