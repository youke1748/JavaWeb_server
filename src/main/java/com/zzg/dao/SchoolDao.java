package com.zzg.dao;

import com.zzg.pojo.entity.SchoolCourse;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolDao {

    /**
     * 得到所有的学院名称
     * @return List<String> 学院名称列表
     */
    List<SchoolCourse> getAllSchoolCourse();

    List<String> getAllSchoolName();

    Integer getIdBySchoolName(@Param(value = "schoolName") String schoolName);
}
