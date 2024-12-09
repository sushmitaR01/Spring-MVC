package com.xworkz.forms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.forms")
public class StringConfirugation {
    StringConfirugation(){
        System.out.println("Running in a StringConfirugation");
    }
}
