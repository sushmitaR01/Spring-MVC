package com.xworkz.camera.components;

public class DSLR implements Cameras{

    public  DSLR(){
        System.out.println("Running in a DSLR");
    }
    @Override
    public int price() {
        return 10000;
    }

    @Override
    public String CameraType() {
        return "3D Camera";
    }
}
