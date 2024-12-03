package com.xworkz.runner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz")
public class StringConfiguration {
    public StringConfiguration(){
        System.out.println("Running in aStringConfiguration");
    }

}
