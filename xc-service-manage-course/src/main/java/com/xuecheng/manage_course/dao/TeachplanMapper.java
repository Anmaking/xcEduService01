package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 课程计划mapper
 * Created by Administrator.
 */
@Component
@Mapper
public interface TeachplanMapper {
    //课程计划查询
    public TeachplanNode selectList(String courseId);
}