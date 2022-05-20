package com.zzg.service;

import com.zzg.pojo.entity.SchoolCourse;
import java.util.List;

public interface SchoolService {
    List<SchoolCourse> getAllSchoolCourse();

    List<String> getSchoolAllName();

}
