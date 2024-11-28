package com.xworkz.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz")
public class StringConfiguration {

    public  StringConfiguration(){
        System.out.println("creating StringConfiguration");
    }
}
