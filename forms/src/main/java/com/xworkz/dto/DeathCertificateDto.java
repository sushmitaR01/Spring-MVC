package com.xworkz.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@NoArgsConstructor
@Data
public class DeathCertificateDto {

    private  String deceasedName;
    private  Integer deceasedAge;
    private  String deceasedAddress;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private  String deceaseddob;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private  String deceasedLastDate;
    private  String deceasedCause;

}
