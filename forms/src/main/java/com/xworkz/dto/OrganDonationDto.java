package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class OrganDonationDto {
    private String fullName;
    private Long phoneNumber;
    private  Integer age;
    private  String permanentAddress;
    private  String presentAddress;
    private  String bloodGroup;
    private  Long aadhaarNo;
    private  Double height;
    private  Double weight;
    private  String organ;
}
