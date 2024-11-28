package com.xworkz.games.runner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class StringConfiguration {
    public  StringConfiguration(){
        System.out.println("creating StringConfiguration");
    }
    @Bean
    public  String teamName(){
        System.out.println("Running with a string in team name");
        String teamname=new String("Rcb");
        return teamname;
    }
    @Bean
    public double budget(){
        System.out.println("Running with double in budget");
        return  2000;
    }
    @Bean
    public  String ownerName(){
        System.out.println("Running with a string in ownerName ");
        String ownerName=new String("Virat");
        return ownerName;
    }
    @Bean
    public double batCost(){
        System.out.println("Running with double in batCost");
        return  8000;
    }
    @Bean
    public double ballCost(){
        System.out.println("Running with double in ballCost");
        return  9000;
    }

}
