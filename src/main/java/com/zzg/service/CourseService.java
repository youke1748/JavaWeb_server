package com.zzg.service;

import com.zzg.pojo.entity.SchoolCourse;


public interface CourseService {
    int addCourse(SchoolCourse schoolCourse);
    int deleteCourseById(int id);
    int updateCourse(SchoolCourse schoolCourse);
}
