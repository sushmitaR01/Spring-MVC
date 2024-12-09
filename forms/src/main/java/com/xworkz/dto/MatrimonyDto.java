package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MatrimonyDto {
    private String firstName;
    private String lastName;
    private String email;
    private  Long phoneNo;
    private String dob;
    private  String gender;
    private  Double weight;
    private Double height;
    private  Double salary ;
    private  String address;
}
