package com.xworkz.forms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@NoArgsConstructor
public class PassportDto {
    private String Registertoapplyat;
    private String PassportOffice;
    private  String GiveName;
    private String Surname;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private  String DateofBirth;
    private  String EmailId;
    private String DoyouwantyourLoginId;
    private String LoginId;
    private String Password;
    private String ConfirmPassword;
    private String HintQuestion;
    private String HintAnswer;

}
