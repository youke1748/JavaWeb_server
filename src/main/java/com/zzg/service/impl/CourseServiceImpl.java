package com.zzg.service.impl;

import com.zzg.dao.CourseDao;
import com.zzg.dao.SchoolDao;
import com.zzg.pojo.Course;
import com.zzg.pojo.entity.SchoolCourse;
import com.zzg.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CourseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    @Autowired
    private SchoolDao schoolDao;


    @Override
    public int addCourse(SchoolCourse schoolCourse) {
        //检查名称是否重复
        if(check(schoolCourse.getName())){
            return 0;
        }
        int sid = schoolDao.getIdBySchoolName(schoolCourse.getSchoolname());
        Course course = new Course();
        course.setHours(schoolCourse.getHours());
        course.setName(schoolCourse.getName());
        course.setSid(sid);
        course.setCover(schoolCourse.getCover());
        return courseDao.addCourse(course);
    }

    @Override
    public int deleteCourseById(int id) {
        return courseDao.deleteCourseById(id);
    }

    @Override
    public int updateCourse(SchoolCourse schoolCourse) {
        //检查名称是否重复
        if(check(schoolCourse.getName())){
            return 0;
        }
        int sid = schoolDao.getIdBySchoolName(schoolCourse.getSchoolname());
        Course course = new Course(schoolCourse.getId(), schoolCourse.getName(), schoolCourse.getHours(), sid,schoolCourse.getCover());
        return courseDao.updateCourseById(course);
    }

    public boolean check(String name){
        List<String> cn = courseDao.getAllCouseName();
        return cn.contains(name);
    }

}
