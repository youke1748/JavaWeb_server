package com.zzg.controller;

import com.zzg.pojo.entity.SchoolCourse;
import com.zzg.service.SchoolService;
import com.zzg.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    //get 所有学院名称
    @GetMapping("/getAllName")
    public Result getSchoolAllName(){
        List<String> nameList = schoolService.getSchoolAllName();
        return Result.succ(200,"成功请求学院列表",nameList);
    }

    //get 所有学院的课程信息
    @GetMapping("/getAllCourse")
    public Result getAllCourse(){
        List<SchoolCourse> allCourse = schoolService.getAllSchoolCourse();
        return Result.succ(200,"成功请求所有课程",allCourse);
    }
}
