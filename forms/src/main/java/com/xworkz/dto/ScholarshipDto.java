package com.xworkz.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ScholarshipDto {
    private String name;
    private String email;
    private Long mobno;
    private String course;
    private String gender;

}
