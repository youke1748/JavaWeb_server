package com.zzg.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolCourse {
    private int id;
    private String name;
    private int hours;
    private String schoolname;
    private String cover;
}
