package com.zzg.service.impl;


import com.zzg.dao.CourseDao;
import com.zzg.dao.SchoolDao;
import com.zzg.pojo.entity.SchoolCourse;
import com.zzg.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;


@Service("SchoolService")
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    private SchoolDao schoolDao;

    @Override
    public List<SchoolCourse> getAllSchoolCourse() {
        List<SchoolCourse> schoolCourseList= schoolDao.getAllSchoolCourse();
        //按学校名称排序
        schoolCourseList.sort(Comparator.comparing(SchoolCourse::getSchoolname));
        return schoolCourseList;
    }

    @Override
    public List<String> getSchoolAllName() {
        List<String> nameList = schoolDao.getAllSchoolName();
        return nameList;
    }
}
