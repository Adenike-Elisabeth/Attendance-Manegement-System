package com.nike.attendancemanagementsystem.models.dtos.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherRequestDTO {
    private String name;
    private String email;
}
