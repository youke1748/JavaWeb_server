package com.zzg.dao;

import com.zzg.pojo.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version : V1.0
 * @Auther zzg
 * @Date: 2020/4/1 17:41
 */
@Repository
public interface CourseDao {
    /**
     * 根据id得到课程信息
     * @param id
     * @return Course 课程对象
     */
    Course getCourseById(@Param(value = "courseID") int id);

    /**
     * 根据学校名字得到课程信息列表
     * @param schoolName
     * @return list<Course> 课程信息列表
     */
    List<Course> getCourseByName(@Param(value = "schoolName") String schoolName);

    /**
     * 根据id修改课程的时间
     * @param id
     * @param hours
     * @return int 修改成功的列
     */
    int updateCourseHoursById(@Param(value = "id") int id,@Param(value = "hours") int hours);

    /**
     * 增加一条课程信息
     * @param course
     * @return int 修改成功的列
     */
    int addCourse(Course course);

    /**
     * 删除课程课程信息
     * @param id
     * @return int 修改成功的列
     */
    int deleteCourseById(@Param(value = "id") int id);

    int updateCourseById(Course course);

    List<String> getAllCouseName();

}
