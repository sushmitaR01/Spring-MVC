package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HospitalDto {
    private  String hospitalName;
    private String email;
    private  long phoneNo;
    private String address;
    private  String city;

}
