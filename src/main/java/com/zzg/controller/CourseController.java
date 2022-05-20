package com.zzg.controller;

import com.zzg.pojo.Course;
import com.zzg.pojo.entity.SchoolCourse;
import com.zzg.service.CourseService;
import com.zzg.service.SchoolService;
import com.zzg.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //增加课程信息
    @PostMapping("/addCourse")
    public Result addCourse(@RequestBody SchoolCourse schoolCourse){
        if(schoolCourse.getCover().equals("")){
            schoolCourse.setCover("/file/5.png");
        }
        int r = courseService.addCourse(schoolCourse);
        if(r != 0){
            return Result.succ(null);
        }else {
            return Result.fail("课程名重复");
        }
    }

    //更新课程信息
    @PostMapping("/updateCourse")
    public Result updateCourse(@RequestBody SchoolCourse schoolCourse){
        int r = courseService.updateCourse(schoolCourse);
        if(r != 0){
            return Result.succ(null);
        }else {
            return Result.fail("课程名重复");
        }
    }

    //删除课程信息
    @DeleteMapping("/deleteCourse")
    public Result deleteCourse(@RequestParam(value = "id") int id){
        int  r = courseService.deleteCourseById(id);
        if(r != 0){
            return Result.succ(null);
        }else {
            return Result.fail("删除失败");
        }
    }
}
